package levannghia60136255;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class LuongLamViec extends Thread{
    Socket socketClient;
    int id = -1;
    public LuongLamViec(Socket socketClient, int id){
        super();
        this.socketClient = socketClient;
        this.id = id;
    }
    @Override
    public void run(){
        try {
            System.out.println(socketClient.getInetAddress().getHostAddress());
            System.out.println(id);
        
            // lấy về luồng xuất nhập
            OutputStream osToClient = socketClient.getOutputStream();
            OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
            BufferedWriter buffWrite  = new BufferedWriter(write2Client);

            InputStream in = socketClient.getInputStream();
            InputStreamReader inReader = new InputStreamReader(in);
            BufferedReader buffRead = new BufferedReader(inReader);
            ///GIAO TIẾP THEO giao thức thiết kế////
            while (true) {                
                //nhận dữ liệu
                String chuoiNhan = buffRead.readLine();
                System.out.println(chuoiNhan);
                // in ra nếu muốn               
                // gửi trả
                String chuoiGui = chuoiNhan;
                buffWrite.write(chuoiGui+"\n");
                buffWrite.flush();
                if (chuoiGui.equals("bye")) break;
            }
            socketClient.close();
        } catch (IOException ex) {
            Logger.getLogger(LuongLamViec.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
