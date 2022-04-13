package lvn60136255;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UDPDiscard_Client {

	public static void main(String[] args) throws IOException {
		String hostABC = "localhost";
		// Tọa socket trên cổng Sky
		DatagramSocket socket = new DatagramSocket();
		int dem =0;
		while(true) {
			System.out.print("UDP Client");
			Scanner bp = new Scanner(System.in);  // Lấy dữu liệu từ bàn phím
			String theLine = bp.nextLine();
			byte[] buff = theLine.getBytes();     //chuyển thành mảng byte
			// Đóng gói vào UDP Datagram
			DatagramPacket datagramPacket = new DatagramPacket(buff, buff.length);
			// cài thông tin header cho goi UDP
			InetAddress addressABC = InetAddress.getByName(hostABC);
			datagramPacket.setAddress(addressABC);
			datagramPacket.setPort(9);
			// Gửi đi
			socket.send(datagramPacket);
			if (dem<100)  dem++;
			else break;
		}

	}

}
