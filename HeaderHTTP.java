package SocKet;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class HeaderHTTP {

	public static void main(String[] args) throws IOException {
		String chuoiURL="https://ntu.edu.vn/Gioi-thieu/Tham-quan-Truong-qua-video";
        URL u = new URL(chuoiURL);
        // mở kết nối
        URLConnection urlCon = u.openConnection();
        urlCon.connect();
        //lấy thông tin Hearder
        System.out.println("ContentType: "+ urlCon.getContentType());

	}

}
