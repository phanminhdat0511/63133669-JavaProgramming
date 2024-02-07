package Bai1;
import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String hoTen;
		System.out.print("Nhập họ và tên: ");
		hoTen = scan.nextLine();
		hoTen.trim(); /*Loại bỏ khoảng trắng đầu và cuối*/
		
		String ho = hoTen.substring(0, hoTen.indexOf(" ")).toUpperCase();
		String tendem = hoTen.substring(hoTen.indexOf(" ")+1, hoTen.lastIndexOf(" "));
		String ten = hoTen.substring(hoTen.lastIndexOf(" ") + 1).toUpperCase();
		
		System.out.printf("Họ: %s\n", ho);
		System.out.printf("Tên đệm: %s\n", tendem);
		System.out.printf("Tên: %s\n", ten);
	}

}
