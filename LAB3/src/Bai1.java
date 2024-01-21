import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		int a;
		boolean ok = true;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nhập vào một số nguyên: ");
		a = scan.nextInt();
		
		for(int i=2; i<a-1; i++) {
			if(a % i ==0) {
				ok = false;
				break;
			}
		}
		if(ok) {
			System.out.println("Là số nguyên tố");
		}
		else {
			System.out.println("Không là số nguyên tố");
		}

	}

}
