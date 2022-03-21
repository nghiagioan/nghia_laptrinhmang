import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileNotFoundException;

public class DocFileNhiPhan {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//tạo đối tượng InputStream
        InputStream ist;
        //Tạo vào file
        FileInputStream FileIn = new FileInputStream("nghia.txt");
        //gắn ot vào Fout
        ist = FileIn;
        //Tạo và gắn vào DataOutputStream
        DataInputStream dtIn = new DataInputStream(FileIn);
        //Đọc dữ liệu
        int a = dtIn.readInt();
        double b = dtIn.readDouble();
        String chuoi = dtIn.readUTF();
        dtIn.close();
        ist.close();
        FileIn.close();
        System.out.println("Hoan thanh cong viec doc file!");
        System.out.println(a);
        System.out.println(b);
        System.out.println(chuoi);

	}

}
