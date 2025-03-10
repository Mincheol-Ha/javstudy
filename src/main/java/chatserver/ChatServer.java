package chatserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer{
    public static ChatRoom room = new ChatRoom();

    public static void main(String[] args) throws IOException{

        ServerSocket sSocket = new ServerSocket(20000);
        System.out.println("chatting start...");
        while(true){
            Socket socket = sSocket.accept(); //클라이언트 접속 대기
            System.out.println(socket + "입장");
            ChatRunner cr = new ChatRunner(socket); //ChatRunner 생성
            ChatServer.room.addChatRunner(cr); //ChatRunner 생성
            cr.start(); //ChatRunner 스레드 시작
        }
    }
}
