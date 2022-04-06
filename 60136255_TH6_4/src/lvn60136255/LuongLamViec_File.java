package lvn60136255;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LuongLamViec_File extends Thread{
    Socket socketClient;
    int id = -1;
    public LuongLamViec_File(Socket socketClient, int id){
        super();
        this.socketClient = socketClient;
        this.id = id;
    }
    void GuiFile(String tenFile, BufferedWriter bf) throws IOException {
        //Lấy về nhập từ file
        FileReader fr = new FileReader(tenFile);
        BufferedReader bufRead = new BufferedReader(fr);
        //Lấy về luồng xuất( để gửi về client)
        OutputStream osToClient = socketClient.getOutputStream();
        OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
        BufferedWriter buffWrite = new BufferedWriter(write2Client);
        // đọc từng dòng
        String line;
        while((line = bufRead.readLine()) != null){
            //Gửi về
            buffWrite.write(line);
            buffWrite.flush();
        }
        fr.close();
    }
    @Override
    public void run(){
        try {
            System.out.println(socketClient.getInetAddress().getHostAddress());
            System.out.println(id);
        
            // lấy về luồng xuất nhập           

            InputStream in = socketClient.getInputStream();
            InputStreamReader inReader = new InputStreamReader(in);
            BufferedReader buffRead = new BufferedReader(inReader);
            ///GIAO TIẾP THEO giao thức thiết kế////
            while (true) {                
            	String chuoiNhan = buffRead.readLine();
                System.out.println(chuoiNhan);
                String chuoiGui="";
                if (chuoiNhan.equals("0")) {
                	chuoiGui="C:\\eclipse-workspace\\nghia.txt";
                }
                if (chuoiNhan.equals("1")) {
                	chuoiGui="C:\\eclipse-workspace\\nghia.txt";
                }
                if (chuoiNhan.equals("2")) {
                	chuoiGui="C:\\eclipse-workspace\\nghia.txt";
                }
                if (chuoiNhan.equals("3")) {
                	chuoiGui="C:\\eclipse-workspace\\nghia.txt";
                }
                if (chuoiNhan.equals("4")) {
                	chuoiGui="C:\\eclipse-workspace\\nghia.txt";
                }
                if (chuoiNhan.equals("5")) {
                	chuoiGui="C:\\eclipse-workspace\\nghia.txt";
                }
                if (chuoiNhan.equals("6")) {
                	chuoiGui="C:\\eclipse-workspace\\nghia.txt";
                }
                if (chuoiNhan.equals("7")) {
                	chuoiGui="C:\\eclipse-workspace\\nghia.txt";
                }
                if (chuoiNhan.equals("8")) {
                	chuoiGui="C:\\eclipse-workspace\\nghia.txt";
                }
                if (chuoiNhan.equals("9")) {
                	chuoiGui="C:\\eclipse-workspace\\nghia.txt";
                }
              
                if (chuoiGui.equals("0")) break;       
            }
            socketClient.close();
        } catch (IOException ex) {
            Logger.getLogger(LuongLamViec_File.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
