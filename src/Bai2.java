import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Chiều dài: ");
        Double chieudai = scanner.nextDouble();
        System.out.println("Chiều rộng: ");
        Double chieurong = scanner.nextDouble();
        Double chuvi = (chieudai+chieurong)*2;
        Double dientich = chieudai*chieurong;
        Double canhnhonhat = Math.min(chieudai,chieurong);
        System.out.println("==============================================");
        System.out.printf("chuvi= %.1f \n dientich = %.1f \n Canh nho nhat = %.1f ",chuvi,dientich,canhnhonhat);

	}

}
