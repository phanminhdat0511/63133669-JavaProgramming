package Bai1;
import java.util.Scanner;

public class Bai1 {
	
	public String tenSP;
	public double donGia;
	public double giamGia;
	
	public Bai1(String tenSP, double donGia, double giamGia) {
	    this.tenSP = tenSP;
	    this.donGia = donGia;
	    this.giamGia = giamGia;
	}


	public void nhap() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nhập tên sản phẩm: ");
		tenSP = scan.nextLine();
		System.out.print("Nhập giá sản phẩm: ");
		donGia = scan.nextDouble();
		System.out.print("Nhập giảm giá: ");
		giamGia = scan.nextDouble();
	}
	
	public double getThueNhapKhau(double donGia) {
		return donGia * 0.1;
	}
	
	public void Xuat() {
		System.out.printf("Tên sản phẩm: %s\t Đơn giá: %f\t Giảm giá: %f\t Thuế nhập khẩu: %f\n", tenSP, donGia, giamGia, getThueNhapKhau(donGia));
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.print("Nhập số lượng sản phẩm: ");
		n = scan.nextInt();
		
		Bai1[] SPList = new Bai1[n];
		for(int i=0; i<n; i++) {
			SPList[i] = new Bai1("", 0, 0);
			System.out.printf("\nSản phẩm thứ %d:\n", i+1);
			SPList[i].nhap();
		}
		System.out.println("Thông tin sản phẩm vừa nhập: ");
		for(int i=0; i<n; i++) {
			SPList[i].Xuat();
		}
		
		scan.close();
	}

}
