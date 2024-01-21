import java.util.Scanner;
import java.lang.Math;

public class Bai4 {

	public void giaiPTB1(double a, double b) {
		if(a==0){ 
			if(b==0)
				System.out.println("Phương trình vô số nghiệm");
			else
				System.out.println("Phương trình vô nghiệm");
		}
		else
			System.out.printf("Nghiệm của phương trình là: %f", (-a/b));
	}
	
	public void giaiPTB2(double a, double b, double c) {
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
	
	public void tinhTienDien(double soDien) {
		if(soDien < 50) 
			System.out.printf("Số tiền điện là: %f", soDien * 1000);
		else
			System.out.printf("Số tiền điện là: %f vnđ", 50*1000 + (soDien-50)*1200);
	}
	
	public static void main(String[] args) {
		Bai4 bai4 = new Bai4();
		int choose;
		double a;
		double b;
		double c;
		double soDien;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("\n\n\n+----------+\n1.Giải phương trình bậc nhất\n2.Giải phương trình bậc hai\n3.Tính tiền điện\n4.Kết thúc\n+----------+");
			choose = scan.nextInt();
			
			switch(choose) {
				/*Giải phương trình bậc 1*/
				case 1:
					System.out.print("Nhập giá trị a: ");
					a = scan.nextDouble();
					System.out.print("Nhập giá trị b: ");
					b = scan.nextDouble();
					bai4.giaiPTB1(a, b);
					break;
					
				/*Giải phương trình bậc 2*/
				case 2:
					System.out.print("Nhập giá trị a: ");
					a = scan.nextDouble();
					System.out.print("Nhập giá trị b: ");
					b = scan.nextDouble();
					System.out.print("Nhập giá trị c: ");
					c = scan.nextDouble();
					bai4.giaiPTB2(a,b,c);
					break;
					
				/*Tính tiền điện*/
				case 3:
					System.out.print("Nhập số điện (kw): ");
					soDien = scan.nextDouble();
					bai4.tinhTienDien(soDien);
				
				/*Kết thúc*/
				case 4:
					break;
			}
		}while(choose != 4);
		scan.close();
	}

}
