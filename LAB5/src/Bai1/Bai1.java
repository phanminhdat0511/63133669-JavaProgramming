package Bai1;
import java.util.Scanner;
import java.util.ArrayList;

public class Bai1 {
	
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		double a;
		System.out.println("Nhập một số vào, ấn 0 để dừng:");
		do {
			a = scan.nextDouble();
			if(a != 0) {
				list.add(a);
			}
		}while(a != 0);
		
		System.out.println("\n Danh sách các số vừa nhập: ");
		for (Double number : list) {
            System.out.println(number);
        }
		scan.close();
	}

}
