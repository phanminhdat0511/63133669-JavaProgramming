package Bai4;

import java.util.Scanner;

import Bai1.Bai1;
import Bai3.Bai3;

public class Bai4 {
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
	
	public void Nhap() {
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
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.print("Nhập số lượng sản phẩm: ");
		n = scan.nextInt();
		
		Bai4[] SPList = new Bai4[n];
		for(int i=0; i<n; i++) {
			SPList[i] = new Bai4();
			System.out.printf("\nSản phẩm thứ %d:\n", i+1);
			SPList[i].Nhap();
		}
		System.out.println("Thông tin sản phẩm vừa nhập: ");
		for(int i=0; i<n; i++) {
			SPList[i].Xuat();
		}
		
		scan.close();

	}

}
