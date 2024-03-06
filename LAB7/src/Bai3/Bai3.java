package Bai3;
import Bai2.Bai2.SinhVienPoly;

public class Bai3 {

	public static class SinhVienIT extends SinhVienPoly{
		protected double diemJava;
		protected double diemCss;
		protected double diemHtml;
		
		public SinhVienIT(String HoTen, String Nganh, double diemJava, double diemCss, double diemHtml) {
	        super(HoTen, Nganh);
	        this.diemJava = diemJava;
	        this.diemCss = diemCss;
	        this.diemHtml = diemHtml;
	    }
		
		@Override
		public double getDiem() {
			return (diemJava + diemHtml + diemCss) / 3;
		}
		
		
	}
	
	public static class SinhVienBiz extends SinhVienPoly{
		protected double diemmarketing;
		protected double diemsales;
		
		public SinhVienBiz(String HoTen,  String Nganh, double diemMarketing, double diemSales) {
	        super(HoTen, Nganh);
	        this.diemmarketing = diemMarketing;
	        this.diemsales = diemSales;
	    }
		
		@Override
		public double getDiem() {
			return (diemmarketing + diemsales) / 2;
		}
		
		
	}
	
	public static void main(String[] args) {
		SinhVienIT svIT1 = new SinhVienIT("Tran Van A", "Ngành IT", 7.5, 8.5, 9.0);
		svIT1.xuat();
		SinhVienBiz svBiz1 = new SinhVienBiz("Nguyen Van B", "Ngành Biz", 8.5, 9.0);
		svBiz1.xuat();
	}

}
