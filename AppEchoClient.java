import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;
public class AppEchoClient {

	public static void main(String[] args) {
		Socket soc;
		
		try {
			soc = new Socket("localhost",9999);
			System.out.print("Connected!\n");
			// Lấy luồng nhập xuất
			InputStream in = soc.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffRead = new BufferedReader(inReader);
			OutputStream osToClient = soc.getOutputStream();
			OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
			BufferedWriter buffWriter = new BufferedWriter(write2Client);
			//----Giao tiếp theo giao thức thiết kế
			// Lấy chuỗi nhập từ bàn phím
			Scanner banphim = new Scanner(System.in);
			while(true)
			{	
				System.out.print("\nClient");
				String chuoiGui = banphim.nextLine();
				// gỬi đi, nếu chuổi không phải là bye
				buffWriter.write(chuoiGui+"\n");
				buffWriter.flush();
				// nhận về
				String chuoiNhan = buffRead.readLine();
				// In ra màn hình client để xem
				System.out.print("Server:"+ chuoiNhan);
				if(chuoiGui.equals("Bye")) break;
			}
			soc.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
