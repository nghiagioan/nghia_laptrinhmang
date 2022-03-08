import java.util.Scanner;
public class Lap3_Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số N: ");
        Double N = scanner.nextDouble();
        boolean SoNguyenTo = true;
        for (int i = 2; i < N-1; i++) {
            if(N%i==0){
                SoNguyenTo=false;
                break;
            }
            //i++;
        }
        if(SoNguyenTo){
            System.out.printf("%.0f là số nguyên tố",N);
        }else{
            System.out.printf("%.0f không là số nguyên tố",N);
        }

	}

}
