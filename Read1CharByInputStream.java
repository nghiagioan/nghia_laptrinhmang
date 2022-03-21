package input;

import java.io.IOException;
import java.io.InputStream;
//import java.io.InputStream;

public class Read1CharByInputStream {

	public static void main(String[] args) throws IOException {		
		// tạo 1 đối tượng của lớp InoputStream
		InputStream is;
		//Gắn nó với luồng nhập chuẩn( bàn phím)
		is = System.in;
		// đọc 1 kí tự
		System.out.print("Mời bạn nhập 1 kí tự: ");
		int kt = is.read();
		System.out.print("Ký tự bạn vừa nhập là: " +(char) kt);
			
			
			
		}

	}


