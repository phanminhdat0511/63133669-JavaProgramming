import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		String hoTen;
		double diem;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nhập họ và tên: ");
		hoTen = scan.nextLine();
		System.out.print("Nhập điểm: ");
		diem = scan.nextDouble();
		scan.close();
		
		System.out.printf("%s %f điểm", hoTen, diem);

	}

}
