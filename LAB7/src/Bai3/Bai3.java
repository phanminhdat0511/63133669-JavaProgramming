package Bai3;
import Bai2.Bai2.SinhVienPoly;

public class Bai3 {

	public static class SinhVienIT extends SinhVienPoly{
		protected double diemJava;
		protected double diemCss;
		protected double diemHtml;
		
		public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCss, double diemHtml) {
	        super(hoTen, nganh);
	        this.diemJava = diemJava;
	        this.diemCss = diemCss;
	        this.diemHtml = diemHtml;
	    }
		
		@Override
		public double getDiem() {
			return (diemJava + diemHtml + diemCss) / 3;
		}
		
		
	}
	
	public static void main(String[] args) {
		SinhVienIT svIT1 = new SinhVienIT("Tên sinh viên", "Ngành", 7.5, 8.5, 9.0);
		svIT1.xuat();
		
	}

}
