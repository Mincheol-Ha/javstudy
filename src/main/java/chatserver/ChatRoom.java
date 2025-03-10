package chatserver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ChatRoom extends ArrayList<ChatRunner>{

    public synchronized void addChatRunner(ChatRunner obj){
        this.add(obj);
    }
    public synchronized void removeChatRunner(Object obj){
        if(this.contains(obj)){
            this.remove(obj);
        }
    }
    public synchronized void sendMsgAll(String msg){
        Iterator<ChatRunner> ir = iterator();
        while(ir.hasNext()){
            ChatRunner c = ir.next();
            try{
                c.sendMessage(msg);
            }catch(IOException e){
                System.out.println(c.toString() + "의 메시지 전송 에러");
            }
        }
    }
}
