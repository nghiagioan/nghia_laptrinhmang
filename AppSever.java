import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class AppSever {

	public static void main(String[] args) {
		try {
			// mở cổng và bắt đầu nge			
			ServerSocket socketServer = new ServerSocket(8888);
			System.out.println("I'm listening on 8888 port...");
			//luôn luôn lắng nge
			while (true)
			{
				// khi có 1 yêu cầu tới, thì Accept
				//Mở 1 Socket để làm vc với client đó
				Socket socketClient = socketServer.accept();
				// gửi trả câu "\Xin chào"
					//b1. Lấy về luồng xuất
					OutputStream osToClient = socketClient.getOutputStream();
					//để gửi chuổi cho tiện
					OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
					BufferedWriter buffW = new BufferedWriter(write2Client);
					// gửi
					buffW.write("Xin chào \n");
					buffW.flush();
				// đóng socker
				socketClient.close();
					
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


}
