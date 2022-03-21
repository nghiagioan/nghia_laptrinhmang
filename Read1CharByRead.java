package input;
import java.io.IOException;
import java.io.InputStreamReader;
public class Read1CharByRead {

	public static void main(String[] args) throws IOException {
		// tao mot doi tuong cua lop InputStreamReader
        InputStreamReader isRdr;
        isRdr = new InputStreamReader(System.in);
        System.out.println("Nhap 1 ki tu: ");
        int kt = isRdr.read();
        System.out.print("Ky tu ban vua nhap la: "+(char)kt);

	}

}
