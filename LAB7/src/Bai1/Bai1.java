package Bai1;

import java.util.Scanner;

public class Bai1 {
	
	public static class chuNhat{
		public double rong;
		public double dai;
		
		public chuNhat(double rong, double dai) {
			this.rong = rong;
			this.dai = dai;
		}
		
		public double getChuVi() {
			return 2 * (rong+dai);
		}
		
		public double getDienTich() {
			return rong * dai;
		}
		
		public void xuat() {
			System.out.println("Chiều rộng hình chữ nhật: " + rong);
			System.out.println("Chiều dài hình chữ nhật: " + dai);
			System.out.println("Chu vi hình chữ nhật: " + getChuVi());
			System.out.println("Diện tích hình chữ nhật: " + getDienTich());
		}
	}
	
	public static class vuong extends chuNhat{
		public vuong(double canh) {
			super(canh, canh);
		}
		public void xuat() {
			System.out.println("Cạnh hình vuông: " + dai);
			System.out.println("Chu vi hình vông: " + getChuVi());
			System.out.println("Diện tích hình vuông: " + getDienTich());
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double rong;
		double dai;
        System.out.print("Chiều rộng hình chữ nhật: ");
        rong = scan.nextDouble();
        System.out.print("Chiều dài hình chữ nhật: ");
        dai = scan.nextDouble();
        chuNhat hcn = new chuNhat(rong, dai);
        hcn.xuat();
        
        System.out.println();
        
        double canh;
        System.out.print("Cạnh hình vuông: ");
        canh = scan.nextDouble();
        vuong vuong = new vuong(canh);
        vuong.xuat();
	}

}
