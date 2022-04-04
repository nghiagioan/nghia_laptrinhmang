package Levannghia60136255;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class CTCHinh {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ServerSocket socketServer = new ServerSocket(9999);
        System.out.println("I'm listening on 9999 port...");
        int id=0;
        while(true){
            Socket soc = socketServer.accept();
            id ++;
            DICH luongTask = new DICH(soc,id);
            luongTask.start();
        }
          
    }
    
}

