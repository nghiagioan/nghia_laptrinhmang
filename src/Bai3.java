import java.util.Scanner;
public class Bai3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Canh : ");
        Double canh = scanner.nextDouble();
        Double thetich = Math.pow(canh, 3);
        System.out.println("==============================================");
        System.out.printf("The tich= %.1f",thetich);

	}

}
