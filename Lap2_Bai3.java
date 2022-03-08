import java.util.Scanner;
public class Lap2_Bai3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("Số điện: ");
        Double soDien = scanner.nextDouble();
        if(soDien<50){
            Double tien = soDien*1000;
            System.out.printf("Số tiền =%.0f ",tien);
        }else{
            Double tien = 50*1000 + (soDien-50)*1200;
            System.out.printf("Số tiền =%.0f ",tien);
        }
        
    }
}
