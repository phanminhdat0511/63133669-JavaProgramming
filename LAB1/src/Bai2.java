import java.util.Scanner;
import java.lang.Math;

public class Bai2 {

	public static void main(String[] args) {
		double chieuDai;
		double chieuRong;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Nhập chiều dài: ");
		chieuDai = scan.nextDouble();
		System.out.printf("Nhập chiều rộng: ");
		chieuRong = scan.nextDouble();
		scan.close();
		
		System.out.printf("Chu vi hình chữ nhật: %f", (chieuDai + chieuRong)*2);
		System.out.println();
		System.out.printf("Diện tích hình chữ nhật: %f", (chieuDai * chieuRong));
		System.out.println();
		System.out.printf("Chiều dài của cạnh nhỏ nhất: %f", Math.min(chieuDai, chieuRong));
	}

}
