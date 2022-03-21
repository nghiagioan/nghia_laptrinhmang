import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class GhiFileNhiPhan {

	public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        //tạo đối tượng OutputStream
        OutputStream ot;
        //Tạo vào file
        FileOutputStream FileOut = new FileOutputStream("nghia.txt");
        //gắn ot vào Fout
        ot = FileOut;
        //Tạo và gắn vào DataOutputStream
        DataOutputStream dtOut = new DataOutputStream(FileOut);
        //Ghi dữ liệu
        dtOut.writeInt(2703);
        dtOut.writeDouble(2.6);
        dtOut.writeUTF("le van nghia");
        dtOut.close();
        ot.close();
        FileOut.close();
        System.out.println("Hoan thanh cong viec ghi file!");
    }

}
