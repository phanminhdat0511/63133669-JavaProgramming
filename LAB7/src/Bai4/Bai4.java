package Bai4;
import Bai2.Bai2.SinhVienPoly;
import java.util.List;
import java.util.Scanner;

public class Bai4 {
	
	public static class SinhVien extends SinhVienPoly{
		public double diem;
		public SinhVien(String hoTen, String nganh, double Diem){
			super(hoTen, nganh);
			this.diem = Diem;
		}
		
		public void nhap() {
			Scanner scan = new Scanner(System.in);
			System.out.print("Họ và tên: ");
			hoTen = scan.next();
			System.out.print("Ngành: ");
			nganh = scan.next();
			System.out.print("Điểm: ");
			diem = scan.nextDouble();
		}
		
		
		
	}

	public static void main(String[] args) {
		

	}

}
