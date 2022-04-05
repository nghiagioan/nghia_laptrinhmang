package Levannghia60136255;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AppServer_Dich {

   
    public static void main(String[] args) {
        try {
            // Mở cổng và bắt đầu nghe
            ServerSocket socketServer = new ServerSocket(9999);
            System.out.println("I'm listening on 9999 port...");
            //lắng nghe
            while(true)
            {            
                //mở một Socket để làm việc với client đó
                Socket socketClient = socketServer.accept();
                //Gửi câu trả lời
                OutputStream osToClient = socketClient.getOutputStream();
                OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
                BufferedWriter bufW = new BufferedWriter(write2Client);
                //gửi
                bufW.write("Xin chao");
                bufW.flush();
                //đóng socket
                socketClient.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
