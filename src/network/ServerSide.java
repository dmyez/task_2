package network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class ServerSide {

    public static void main (String[] args) throws IOException, InterruptedException {
        ServerSocket server = new ServerSocket(5555);
        server.setReuseAddress(true);



        System.out.println("Server is ready to connection");
        Socket connection = server.accept();
        System.out.println("Connection accepted");
        InputThread input = new InputThread(connection);
        OutputThread output = new OutputThread(connection);
        input.start();
        output.start();

        Thread.sleep(120000);
        input.stopThread();
        output.stopThread();


  //      String question = sc.nextLine();
   //     System.out.println("From client" + question);
   //     writer.writeBytes( question.toUpperCase() + "\n");
  //      connection.close();
       server.close();
    }
}
