import java.util.Scanner;
import java.lang.Math;

public class Bai3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double canh;
		System.out.printf("Nhập chiều dài cạnh của đa giác: ");
		canh = scan.nextDouble();
		scan.close();
		System.out.printf("Thể tích lập phương: %f", canh * canh * canh);
		System.out.println();
		System.out.printf("Thể tích lập phương: %f", Math.pow(canh, 3));
	}

}
