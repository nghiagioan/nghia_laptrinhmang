package levannghia60136255;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class KTServer {

	public static void main(String[] args) {
		try {			
			ServerSocket socketServer = new ServerSocket(9999);
			System.out.println("I'm listening on 9999 port....");
			while (true)
			{
				Socket socketClient = socketServer.accept();
				OutputStream osToClient = socketClient.getOutputStream();
				OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
				BufferedWriter bufferWrite = new BufferedWriter(write2Client);
				InputStream in =  socketClient.getInputStream();
				InputStreamReader inReader = new InputStreamReader(in);
				BufferedReader buffRead = new BufferedReader(inReader);
				while (true)
				{
					//gửi mời nhập a, nhận a
					String chuoiMoiNhapA_Gui = "Nhập a: ";
					bufferWrite.write(chuoiMoiNhapA_Gui+"\n");
                    bufferWrite.flush();
                    String chuoiGuiA_Nhan = buffRead.readLine();
                    System.out.println("nhan: "+chuoiGuiA_Nhan);
                    float a = Float.parseFloat(chuoiGuiA_Nhan);
                    //gửi mời nhập b, nhận b
                    String chuoiMoiNhapB_Gui = "Nhập b: ";
					bufferWrite.write(chuoiMoiNhapB_Gui+"\n");
                    bufferWrite.flush();
                    String chuoiGuiB_Nhan = buffRead.readLine();
                    System.out.println("nhan: "+chuoiGuiB_Nhan);
                    float b = Float.parseFloat(chuoiGuiB_Nhan);
                    // Mời nhập phép toán , nhận phép toán
                    String chuoiMoiNhapPhepToan_Gui = "Nhập phép toán: ";
					bufferWrite.write(chuoiMoiNhapPhepToan_Gui+"\n");
                    bufferWrite.flush();
                    String chuoiGuiPhepToan_Nhan = buffRead.readLine();
                    System.out.println("nhan: "+chuoiGuiPhepToan_Nhan);
                    float tong = 0;
                    switch (chuoiGuiPhepToan_Nhan) {
                              case "+" -> tong = a + b;
                              case "-" -> tong = a - b;
                              case "*" -> tong = a * b;
                              case "/" -> {
                              if (b == 0) {
                                   bufferWrite.write("b phải khác 0");
                                   bufferWrite.flush();
                              } else {                
                                    tong = a / b; 
                               }   }
                              default ->  System.out.println("Nhập phép tính không hợp lệ");
                                            }
                    // Xử lý , gửi kết quả
                     String KQ_Gui=String.valueOf(tong);
                     bufferWrite.write(KQ_Gui+"\n");
                     bufferWrite.flush();
                     //Hỏi có làm nữa hay không nhận không thì ngưng và ngược lại
                     String chuoiLamTiepHayKhong_Gui = "Làm tiếp hay không";
                     bufferWrite.write(chuoiLamTiepHayKhong_Gui+"\n");
                     bufferWrite.flush();
                     String chuoiLamTiepHayKhong_Nhan = buffRead.readLine();
                     System.out.println("Nhận: "+chuoiLamTiepHayKhong_Nhan);
					 if (chuoiLamTiepHayKhong_Nhan.equals("Không")) break;
				}
				socketServer.close();
			}
		} catch (IOException e) {			
			e.printStackTrace();
		}		

	}

}


