import java.util.Scanner;
import java.util.Arrays;
public class Lap3_Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, Min;
        double sum = 0, dem = 0;
    Scanner scanner = new Scanner(System.in);
         
    do {
        System.out.println("Nhập số phần tử: ");
        n = scanner.nextInt();
    } while (n < 0);
         
    
    int array[] = new int[n];
         
    for (int i = 0; i < n; i++) {
        System.out.println("Nhập phần tử thứ " + i + ": ");
        array[i] = scanner.nextInt();
    }
         
    
    System.out.println("\nMảng ban đầu: ");
    for (int i = 0; i < n; i++) {
        System.out.print(array[i] + "\t");
    }
    Arrays.sort(array);
    System.out.println("\nMảng sau khi sắp xếp: "+Arrays.toString(array));
    int min=array[1];
    for (int i = 0; i < n; i++) {
        Min = Math.min(min, array[i]);
        System.out.printf("Phần tử nhỏ nhất: %d",Min);
        break;
    }
    for (int i = 0; i < n; i++) {
        if (array[i]%3==0) {
            sum = array[i]+sum;
            dem = dem + 1;
        }
    }
    double S = sum / dem;
    System.out.printf("\nTrung bình cộng: %.3f", S);
    }	

}
