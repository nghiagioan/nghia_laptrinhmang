package levannghia60136255;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class CTChinh {

    public static void main(String[] args) throws IOException {
        // Mở cổng và bắt đầu lắng nge
        ServerSocket socketServer = new ServerSocket(9999);
        System.out.println("I'm listening on 9999 port...");
        int id=0;
        while(true){
            Socket soc = socketServer.accept();
            id ++;
            // new LuongLamViec(s, id++).start();
            LuongLamViec luongTask = new LuongLamViec(soc,id);
            luongTask.start();
        }
          
    }
    
}
