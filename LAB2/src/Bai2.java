import java.util.Scanner;
import java.lang.Math;

public class Bai2 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nhập giá trị a: ");
		a = scan.nextDouble();
		System.out.print("Nhập giá trị b: ");
		b = scan.nextDouble();
		System.out.print("Nhập giá trị c: ");
		c = scan.nextDouble();
		scan.close();
		
		if(a==0) {
			if(b==0){
				if(c==0)
					System.out.println("Phương trình vô số nghiệm");
				else
					System.out.println("Phương trình vô nghiệm");
			}
			else
				System.out.printf("Nghiệm của phương trình là: %f", (-c/b));
		}
		else {
			double delta = Math.pow(b, 2) - 4*a*c;
			if(delta < 0)
				System.out.println("Phương trình vô nghiệm");
			else if(delta == 0)
				System.out.printf("Phương trình có nghiệm kép: %f", -b/(2*a));
			else {
				System.out.println("Phương trình có 2 nghiệm phân biệt");
				System.out.printf("X1 = %f", (-b+Math.sqrt(delta))/(2*a));
				System.out.println();
				System.out.printf("X1 = %f", (-b-Math.sqrt(delta))/(2*a));
			}
		}
	}
}

