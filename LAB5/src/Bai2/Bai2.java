package Bai2;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Bai2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> hoten = new ArrayList<>();
		String input;
		System.out.println("Nhập danh sách gồm họ và tên. Nhấn '0' để kết thúc!");
		int i=0;
		do {
			System.out.printf("%d:", i);
			input = scan.nextLine();
			/*equals dùng để so sánh 2 chuỗi với nhau. nếu nhập vào chỉ có số 0 thì sẽ dừng, nhưng nếu chuỗi khác
			 * 0 thì sẽ được lưu vào List
			 * */
			if(!input.equals("0")) {
				hoten.add(input);
				i++;
			}
		}while(!input.equals("0"));
		
		System.out.println("\nDanh sách các họ tên vừa nhập");
		int thutu;
		thutu = 0;
		for(String output : hoten) {
			System.out.print(+ thutu + ".");
			System.out.print(output);
			System.out.print("\t");
			thutu ++;
		}
		
		//Xuất danh sách vừa nhập với thứ tự ngẫu nhiên
		System.out.println("\n\nDanh sách sau khi được đổi thứ tự:");
		Collections.shuffle(hoten);
		thutu = 0;
		for(String output : hoten) {
			System.out.print(+ thutu + ".");
			System.out.print(output);
			System.out.print("\t");
			thutu ++;
		}
		
		//Sắp xếp danh sách giảm dần. Gồm 2 bước.
		//1. Sắp xếp tăng tăng dần với sort
		//2. Sau đó dùng reverse để đảo ngược danh sách
		System.out.println("\n\nDanh sách với thứ tự giảm dần:");
		Collections.sort(hoten);
		Collections.reverse(hoten);
		thutu = 0;
		for(String output : hoten) {
			System.out.print(+ thutu + ".");
			System.out.print(output);
			System.out.print("\t");
			thutu ++;
		}
		
		//Tìm và xóa họ tên tại vị trí nhập từ bàn phím
		System.out.print("\n\nNhập vị trí muốn xóa: ");
		int addr;
		addr = scan.nextInt();
		hoten.remove(addr);
		System.out.print("\nDanh sách sau khi xóa:");
		thutu = 0;
		for(String output : hoten) {
			System.out.print(+ thutu + ".");
			System.out.print(output);
			System.out.print("\t");
			thutu ++;
		}
	}

}
