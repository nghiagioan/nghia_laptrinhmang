import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class CT {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String chuoiURL="https://ntu.edu.vn/Gioi-thieu/Tham-quan-Truong-qua-video";
		URL u = new URL(chuoiURL);
		// lấy về luồng nhập
		InputStream in = u.openStream();
		InputStreamReader INR = new InputStreamReader(in);
		BufferedReader buffer = new BufferedReader(INR);
		String lineHTML;
		while (true)
		{
			lineHTML = buffer.readLine();
			if (lineHTML == null) 
				break;
			else
				System.out.println(lineHTML);
		}
//		System.out.println(   buffer.readLine()  );
//		System.out.println(   buffer.readLine()  );
//		System.out.println(   buffer.readLine()  );
//		System.out.println(   buffer.readLine()  );
//		System.out.println(   buffer.readLine()  );
//		System.out.println(   buffer.readLine()  );
//		System.out.println(   buffer.readLine()  );
//		System.out.println(   buffer.readLine()  );
		
		buffer.close();
		INR.close();
		in.close();
		
	}

}
