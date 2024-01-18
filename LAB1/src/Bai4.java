import java.util.Scanner;
import java.lang.Math;

public class Bai4 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nhập a: ");
		a = scan.nextDouble();
		System.out.print("Nhập b: ");
		b = scan.nextDouble();
		System.out.print("Nhập c: ");
		c = scan.nextDouble();
		
		scan.close();
		
		double delta = Math.pow(b,2) - 4*a*c;
		
		System.out.printf("Delta = %f", delta);
		System.out.println();
		System.out.printf("Căn bậc 2 của Delta = %f", Math.sqrt(delta));
	}

}
