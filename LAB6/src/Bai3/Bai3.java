package Bai3;
import java.util.Scanner;
import java.util.ArrayList;

public class Bai3 {

	public String hoTen;
	public String email;
	public String checkEmail = "\\w+@\\w+(\\.\\w+){1,2}";
	public String sdt;
	public String checkSdt = "\\d{10}";
	public String cmnd;
	public String checkCmnd = "\\d{10}";
	
	
	public String getHoTen() {
		return hoTen;
	}



	public String getEmail() {
		return email;
	}



	public String getSdt() {
		return sdt;
	}



	public String getCmnd() {
		return cmnd;
	}

	public void nhap() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập họ và tên: ");
		hoTen = scan.nextLine();
		
		do {
			System.out.print("Nhập địa chỉ Email:");
			email = scan.nextLine();
			if(email.matches(checkEmail))
				break;
			else 
				System.out.println("Địa chỉ email không hợp lệ!!");
		}while(!email.matches(checkEmail));
		
		do {
			System.out.print("Nhập số điện thoại: ");
			sdt = scan.nextLine();
			if(sdt.matches(checkSdt)) 
				break;
			else 
				System.out.println("Số điện thoại không hợp lệ!!");
		}while(!sdt.matches(checkSdt));
		
		do {
			System.out.print("Nhập số chứng minh nhân dân: ");
			cmnd = scan.nextLine();
			if(cmnd.matches(checkCmnd))
				break;
			else
				System.out.println("Số chứng minh nhân dân không hợp lệ!!");
		}while(!cmnd.matches(checkCmnd));
	}
	
	public void xuat() {
		System.out.printf("%s\t%s\t%s\t%s\n", hoTen.toUpperCase(), email, sdt, cmnd);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Bai3> infoList = new ArrayList<>();
		
		int soLuong;
		System.out.print("Nhập số lượng sinh viên muốn thêm vào: ");
		soLuong = scan.nextInt();
		for(int i=0; i<soLuong; i++) {
			System.out.printf("Sin viên thứ %d:\n", i+1);
			Bai3 sv = new Bai3();
			sv.nhap();
			infoList.add(sv);
			System.out.println();
		}
		
		System.out.println("Thông tin các sinh viên vừa nhập:");
		for(Bai3 svoutput : infoList) {
			svoutput.xuat();
		}

	}

}
