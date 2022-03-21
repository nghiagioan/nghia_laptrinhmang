package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLine {

	public static void main(String[] args) throws IOException {
		InputStreamReader isRdr;
        isRdr = new InputStreamReader(System.in);
        BufferedReader buffReader = new BufferedReader(isRdr);
        System.out.println("Nhap chuoi ky tu: ");
        String strLine = buffReader.readLine();
        System.out.println("Chuoi ky tu ban vua nhap la: "+strLine);

	}

}
