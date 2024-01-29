package Bai2;
import Bai1.Bai1;

public class Bai2 {

	public static void main(String[] args) {
		Bai1 sp1 = new Bai1("Sản phẩm 1", 100, 10);
		Bai1 sp2 = new Bai1("Sản phẩm 2", 10, 1);
		
		System.out.println("2 sản phẩm vừa nhập: ");
		sp1.Xuat();
		sp2.Xuat();
	}

}
