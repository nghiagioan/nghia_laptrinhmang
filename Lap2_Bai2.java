import java.util.Scanner;
public class Lap2_Bai2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("số a: ");
        Double soA = scanner.nextDouble();
        System.out.println("số b: ");
        Double soB = scanner.nextDouble();
        System.out.println("số C: ");
        Double soC = scanner.nextDouble();
        if (soA==0) {
            if(soB==0){
                if (soC==0) {
                    System.out.println("Vô số nghiệm");
                }else {
                    System.out.println("Vô nghiệm");
                }
            }else{
                Double x = -soC/soB;
                System.out.printf("Nghiệm x =%.3f ",x);
            }
        }else
        {
            Double delta = Math.pow(soB,2)-4*soA*soC;
            Double CanDelta = Math.sqrt(delta);
            if (delta<0) {
                System.out.println("Vô nghiệm");
            }
            if (delta==0) {
                Double x = -soB/(2*soA);
                System.out.printf("Nghiệm kép x: %.3f",x);
            }
            if (delta>0) {
                Double x1 = (-soB+CanDelta)/(2*soA);
                Double x2 = (-soB-CanDelta)/(2*soA);
                System.out.printf("Nghiệm X1 = %.3f \nNghiệm X2 = %.3f",x1,x2);
            }
            
        }
        
    }
}
