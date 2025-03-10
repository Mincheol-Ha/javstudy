package chatserver;

import java.io.*;
import java.net.Socket;

public class ChatRunner extends Thread{
    private boolean flag = false;
    private Socket socket = null;
    private BufferedReader br = null;
    private BufferedWriter bw = null;
    public ChatRunner(Socket socket) throws IOException{
        this.socket = socket;
        br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
    }
    public void run(){
        try{
            while(!this.flag){
                String msg = br.readLine();
                if(msg!=null && !msg.equals("")){
                    ChatServer.room.sendMsgAll(msg);
                }else{
                    this.flag = true;
                }
            }
            ChatServer.room.removeChatRunner(this);
            br.close();
            bw.close();
            socket.close();
        }catch(IOException e){e.printStackTrace();}
    }
    public void sendMessage(String msg) throws IOException{
        this.bw.write(msg + "\n");
        this.bw.flush();
    }
    public String toString(){
        return socket.toString();
    }
}

