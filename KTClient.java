package levannghia60136255;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class KTClient {

	public static void main(String[] args) {
		Socket soc;
        try {
                soc = new Socket("localhost",9999);
                System.out.print("Connected!\n");
                InputStream in = soc.getInputStream();
                InputStreamReader inReader = new InputStreamReader(in);
                BufferedReader buffRead = new BufferedReader(inReader);
                OutputStream osToClient = soc.getOutputStream();
                OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
                BufferedWriter buffWriter = new BufferedWriter(write2Client);
                Scanner banphim = new Scanner(System.in);
                                
                //Nhận yêu cầu nhập a, rồi gửi a
                String chuoiMoiNhapA_Nhan = buffRead.readLine();
                System.out.println("Server: " + chuoiMoiNhapA_Nhan);
                System.out.println("Client:");
                String chuoiGuiA_Gui = banphim.nextLine();
                buffWriter.write(chuoiGuiA_Gui+"\n");
                buffWriter.flush();
                //Nhận yêu cầu nhập b, rồi gửi b
                String chuoiMoiNhapB_Nhan = buffRead.readLine();
                System.out.println("Server: " + chuoiMoiNhapB_Nhan);
                System.out.println("Client:");
                String chuoiGuiB_Gui = banphim.nextLine();
                buffWriter.write(chuoiGuiB_Gui+"\n");
                buffWriter.flush();
                //Nhận yêu cầu nhập phép tính, rồi gửi phép tính
                String chuoiMoiNhapPhepToan_Nhan = buffRead.readLine();
                System.out.println("Server: " + chuoiMoiNhapPhepToan_Nhan);
                System.out.println("Client:");
                String chuoiGuiPhepToan_Gui = banphim.nextLine();
                buffWriter.write(chuoiGuiPhepToan_Gui+"\n");
                buffWriter.flush();
                //nhận câu trả lời và có làm tiếp không
                String chuoiLamTiepHayKhong_Nhan = buffRead.readLine();
                System.out.println("Server: " + chuoiLamTiepHayKhong_Nhan);
                //trả lời có hoặc không
                String chuoiLamTiepHayKhong_Gui = banphim.nextLine();
                buffWriter.write(chuoiLamTiepHayKhong_Gui+"\n");
                buffWriter.flush();
                                                                    
			soc.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}



