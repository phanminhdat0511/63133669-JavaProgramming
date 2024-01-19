import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		double soDien;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nhập số điện (kw): ");;
		soDien = scan.nextDouble();
		scan.close();
		
		if(soDien < 50)
			System.out.printf("Số tiền điện: %f vnđ", soDien*1000);
		else 
			System.out.printf("Số tiền điện: %f vnđ", 50*1000 + (soDien - 50)*1200);

	}

}
