import java.util.Scanner;
public class Lap3_Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int x = 10;
        for (int i = 2; i < x; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.printf("%d*%d = %d",i,j,i*j);
                System.out.println();
            }
            System.out.println("--------------");
        }
	}

}
