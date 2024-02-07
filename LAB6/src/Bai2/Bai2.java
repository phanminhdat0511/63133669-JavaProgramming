package Bai2;
import java.util.Scanner;
import java.util.ArrayList;

public class Bai2 {
	public String tenSp;
	public double donGia;
	public String hang;
	
	public String getTenSp() {
		return tenSp;
	}
	
	public double getDonGia() {
		return donGia;
	}
	
	public String getHang() {
		return hang;
	}
	
	public void Nhap() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nhập tên sản phẩm: ");
		tenSp = scan.nextLine();
		System.out.print("Nhập giá sản phẩm: ");
		donGia = scan.nextDouble();
		System.out.print("Nhập hãng sản xuất: ");
		scan.nextLine();
		hang = scan.nextLine();
	}
	
	public void Xuat() {
		System.out.printf("%s\t%f\t%s\n", tenSp, donGia, hang);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soLuong;
		
		System.out.print("Nhập số lượng sản phẩm muốn thêm: ");
		soLuong = scan.nextInt();
		
		ArrayList<Bai2> spList = new ArrayList<>();
		for(int i=0; i<soLuong; i++) {
			System.out.printf("\nNhập thông tin cho sản phẩm %d:\n", i);
			Bai2 sp = new Bai2();
			sp.Nhap();
			spList.add(sp);
		}
		
		System.out.println("\nThông tin của các sản phẩm vừa nhập:");
		for(Bai2 sp : spList) {
			sp.Xuat();
		}

		System.out.println("\nCác sản phẩm của hãng Nokia:");
		for(Bai2 sp : spList) {
			if(sp.getHang().equalsIgnoreCase("nokia"))
				sp.Xuat();
		}
		
	}

}
