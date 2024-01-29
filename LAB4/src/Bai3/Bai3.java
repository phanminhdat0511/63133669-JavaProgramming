package Bai3;
import java.util.Scanner;

public class Bai3 {
	
	private String tenSP;
	private double donGia;
	private double giamGia;
	
	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}
	
	public Bai3(String tenSP, double donGia, double giamGia) {
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	
	public Bai3(String tenSP, double donGia) {
		this(tenSP, donGia, 0);
	}

	public void Nhap(String tenSP, double donGia, double giamGia) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập tên sản phẩm: ");
		tenSP = scan.nextLine();
		System.out.print("Nhập giá sản phẩm: ");
		donGia = scan.nextDouble();
		System.out.print("Nhập giảm giá: ");
		giamGia = scan.nextDouble();
	}
	
	public void Xuat() {
		System.out.printf("Tên sản phẩm: %s\t Đơn giá: %f\t Giảm giá: %f\n", tenSP, donGia, giamGia);
	}
	
	public static void main(String[] args) {
		Bai3 sp1 = new Bai3("Sản phẩm 1", 100, 10);
		Bai3 sp2 = new Bai3("Sản phẩm 2", 50);

	        // Xuất thông tin sản phẩm ra màn hình
	        System.out.println("Thông tin sản phẩm 1:");
	        sp1.Xuat();

	        System.out.println("\nThông tin sản phẩm 2:");
	        sp2.Xuat();
	}
}
