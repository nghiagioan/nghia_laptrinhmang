import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class AppEchoServer {

	public static void main(String[] args) {
		try {			
			ServerSocket socketServer = new ServerSocket(9999);
			System.out.println("I'm listening on 9999 port....");
			while (true)
			{	//Khi có 1 yêu cầu thì accpet
				//mở 1 socket để làm vc với client
				Socket socketClient = socketServer.accept();
				// Lấy về luồng xuất nhập
				OutputStream osToClient = socketClient.getOutputStream();
				OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
				BufferedWriter bufferWrite = new BufferedWriter(write2Client);
				InputStream in =  socketClient.getInputStream();
				
				InputStreamReader inReader = new InputStreamReader(in);
				BufferedReader buffRead = new BufferedReader(inReader);
				// Giao tiếp theo giao thức thiết kế
				while (true)
				{
					// nhận dữ liệu
					String chuoiNhan = buffRead.readLine();
					//in ra nếu muốn
					//Gửi trả
					String chuoiGui = chuoiNhan;
					bufferWrite.write(chuoiGui+"\n");
					bufferWrite.flush();                             					
					if (chuoiGui.equals("Bye")) break;
				}
				socketClient.close();
			}
		} catch (IOException e) {			
			e.printStackTrace();
		}		

	}

}
