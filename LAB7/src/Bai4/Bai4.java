package Bai4;
import Bai2.Bai2.SinhVienPoly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bai4 {
	
	public static class SinhVien extends SinhVienPoly{
		protected double diem;
		public SinhVien(String HoTen, String Nganh, double Diem){
			super(HoTen, Nganh);
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
		
		@Override
		public double getDiem() {
			return diem;
		}
		
		public String getHocLuc() {
	        if (getDiem() < 5)
	            return "Yếu";
	        else if (getDiem() < 6.6)
	            return "Trung bình";
	        else if (getDiem() < 7.5)
	            return "Khá";
	        else if (getDiem() < 9)
	            return "Giỏi";
	        else
	            return "Xuất sắc";
	    }
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<SinhVien> SVList = new ArrayList<>();
		int soLuong;
		soLuong = scan.nextInt();
		for(int i=0; i<soLuong; i++) {
			SinhVien sv = new SinhVien("", "", 0);
			sv.nhap();
			SVList.add(sv);
		}
		
		for(SinhVien sv:SVList) {
			sv.getHocLuc();
			if(sv.getHocLuc().equals("Giỏi"))
				sv.xuat();
		}
	}

}
