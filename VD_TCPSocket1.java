package SocKet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class VD_TCPSocket1 {

	public static void main(String[] args) {
		try {
            // TODO code application logic here
            Socket socket = new Socket("time.nist.gov", 13);
            System.out.println("Connected!");
            
            InputStream in = socket.getInputStream();
            InputStreamReader inReader = new InputStreamReader(in);
            BufferedReader buff = new BufferedReader(inReader);
            System.out.println(buff.readLine());
            System.out.println(buff.readLine());
            System.out.println(buff.readLine());
            System.out.println(buff.readLine());
            System.out.println(buff.readLine());
            
        } catch (IOException ex) {
            System.out.println("Not Connected!");
        }

	}

}
