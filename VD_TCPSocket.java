package SocKet;

import java.io.IOException;
import java.net.Socket;
 // mở 1 yêu cầu TCP Socket
// đến cổng 80,của NTU
public class VD_TCPSocket {

	public static void main(String[] args) {
		try {
            
            Socket socket = new Socket("ntu.edu.vn", 80);
            System.out.println("Connected!");
        } catch (IOException ex) {
            System.out.println("Not Connected!");
        }

	}

}
