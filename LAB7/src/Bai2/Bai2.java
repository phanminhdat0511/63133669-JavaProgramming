package Bai2;

public class Bai2 {
	
	public abstract class SinhVienPoly {
	    public String hoTen;
	    public String nganh;
	    
	    protected SinhVienPoly(String HoTen, String Nganh) {
			super();
			this.hoTen = HoTen;
		}

		public abstract double getDiem();

	    public void getHocLuc() {
	        if (getDiem() < 5)
	            System.out.println("Yếu");
	        else if (getDiem() < 6.6)
	            System.out.println("Trung bình");
	        else if (getDiem() < 7.5)
	            System.out.println("Khá");
	        else if (getDiem() < 9)
	            System.out.println("Giỏi");
	        else
	            System.out.println("Xuất sắc");
	    }

	    public void xuat() {
	        System.out.print(hoTen + nganh + getDiem());
	        getHocLuc();
	    }
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
