import java.util.Scanner;

public class Bai2 {
	
	public static void main(String[] args) {
		int a;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bảng cửu chương: ");
		a = scan.nextInt();
		scan.close();
		for(int i=1; i<=10; i++) {
			System.out.printf("%d x %d = %d\n", a, i, a*i);
		}
		
		System.out.println("\n\n\nTổng hợp 9 bảng cửu chương:");
		for(int i=1; i<=9; i++) {
			System.out.printf("\nBảng cửu chương %d:\n", i);
			for(int j=1; j<=10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
		}
	}
	
}
