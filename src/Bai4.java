import java.util.Scanner;
public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so a: ");
        Double soA = scanner.nextDouble();
        System.out.println("nhap so b: ");
        Double soB = scanner.nextDouble();
        System.out.println("nhap so c: ");
        Double soC = scanner.nextDouble();
        Double Delta = Math.pow(soB,2)-4*soA*soC;
        Double CanDelta = Math.sqrt(Delta);
        System.out.println("==============================================");
        System.out.printf("Can Delta =%.3f ",CanDelta);

	}

}
