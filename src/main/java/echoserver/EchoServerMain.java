package echoserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class EchoServerMain {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(50000);
        System.out.println(50000 + " Port Echo Server Running...");
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println(new Date().toString() + ":" + socket.toString());
            System.out.println(socket.getLocalPort());
            System.out.println(socket.getPort());
            BufferedReader br;
            BufferedWriter bw;
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            String temp = br.readLine();
            bw.write(temp + "1\n"); bw.flush();
            bw.write(temp + "2\n"); bw.flush();
            bw.write(temp + "3\n"); bw.flush();
            br.close();
            socket.close();

        }
    }
}
