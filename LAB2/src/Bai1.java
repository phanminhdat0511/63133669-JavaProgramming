import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		double a;
		double b;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nhập giá trị a: ");
		a = scan.nextDouble();
		System.out.print("Nhập giá trị b: ");
		b = scan.nextDouble();
		scan.close();
		
		if(a==0) {
			if(b==0)
				System.out.println("Phương trình vô số nghiệm");
			else
				System.out.println("Phương trình vônghiệm");
		}
		else
			System.out.printf("Nghiệm của phương trình là: %f", (-b/a));
		
	}

}
