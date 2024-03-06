package Bai2;

public class Bai2 {
	
	public abstract class SinhVienPoly {
	    public String hoTen;
	    public String nganh;
	    
	    protected SinhVienPoly(String HoTen, String Nganh) {
			this.hoTen = HoTen;
			this.nganh = Nganh;
		}

		public abstract double getDiem();

		public String getHocLuc() {
	        if (getDiem() < 5)
	            return "Yếu";
	        else if (getDiem() < 6.6)
	            return "Trung bình";
	        else if (getDiem() < 7.5)
	            return "Khá";
	        else if (getDiem() < 9)
	            return "Giỏi";
	        else
	            return "Xuất sắc";
	    }

	    public void xuat() {
	        System.out.print(hoTen + nganh + getDiem() + getHocLuc());
	        
	    }
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
