import java.util.Scanner;
public class Lap2_Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("số a: ");
        Double soA = scanner.nextDouble();
        System.out.println("số b: ");
        Double soB = scanner.nextDouble();
        if(soA==0){
            if (soB==0) {
                System.out.println("Vô số nghiệm");
            }else {
                System.out.println("Vô nghiệm");
            }
        }else{
            Double x = -soB/soA;
            System.out.printf("Nghiệm x =%.3f ",x);
        }
        
    }
	
}
