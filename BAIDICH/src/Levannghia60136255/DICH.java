package Levannghia60136255;

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


public class DICH extends Thread{
    Socket socketClient;
    int id = -1;
    public DICH(Socket socketClient, int id){
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
                String chuoiGui="";
                if (chuoiNhan.equals("0")) {
                	chuoiGui="Zero";
                }
                if (chuoiNhan.equals("1")) {
                	chuoiGui="One";
                }
                if (chuoiNhan.equals("2")) {
                	chuoiGui="Two";
                }
                if (chuoiNhan.equals("3")) {
                	chuoiGui="Three";
                }
                if (chuoiNhan.equals("4")) {
                	chuoiGui="Four";
                }
                if (chuoiNhan.equals("5")) {
                	chuoiGui="Five";
                }
                if (chuoiNhan.equals("6")) {
                	chuoiGui="Six";
                }
                if (chuoiNhan.equals("7")) {
                	chuoiGui="Server";
                }
                if (chuoiNhan.equals("8")) {
                	chuoiGui="Eight";
                }
                if (chuoiNhan.equals("9")) {
                	chuoiGui="Night";
                }
                buffWrite.write(chuoiGui +"\n");
                buffWrite.flush();
                if (chuoiGui.equals("10")) break;
            }
            socketClient.close();
        } catch (IOException ex) {
            Logger.getLogger(DICH.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}