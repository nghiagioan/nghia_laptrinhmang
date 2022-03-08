import java.util.Scanner;
public class Lap2_Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("Số thứ tự: ");
        int soTT = scanner.nextInt();
        switch(soTT){
            case 1:
                System.out.println("Giải Phương Trình Bậc Nhất");
                Scanner sc1 = new Scanner(System.in);
                System.out.println("số a: ");
                Double soA = sc1.nextDouble();
                System.out.println("số b: ");
                Double soB = sc1.nextDouble();
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
                break;
            case 2:
                System.out.println("Giải Phương Trình Bậc 2");
                Scanner sc2 = new Scanner(System.in);
                System.out.println("số a: ");
                soA = sc2.nextDouble();
                System.out.println("số b: ");
                soB = sc2.nextDouble();
                System.out.println("số C: ");
                Double soC = sc2.nextDouble();
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
                break;    
            case 3:
                System.out.println("Tính Tiền Điện");
                Scanner sc3 = new Scanner(System.in);
                System.out.println("Số điện: ");
                Double soDien = sc3.nextDouble();
                if(soDien<50){
                    Double tien = soDien*1000;
                    System.out.printf("Số tiền =%.0f ",tien);
                }else{
                    Double tien = 50*1000 + (soDien-50)*1200;
                    System.out.printf("Số tiền =%.0f ",tien);
                }
                break;
            case 4:
                System.out.println("Kết Thúc");
                break;
        }
	}

}
