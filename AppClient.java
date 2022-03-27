import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class AppClient {

	public static void main(String[] args) {
		// tạo 1 kết nối Socket đến Server
		try {						
			Socket soc = new Socket("localhost", 8888);
			System.out.print("Connected");
			//Lấy luồng nhập
			InputStream in = soc.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buff = new BufferedReader(inReader);
			//đọc trả lời và in
			System.out.print(buff.readLine());
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
