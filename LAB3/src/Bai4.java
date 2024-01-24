import java.util.Scanner;

public class Bai4 {
	private String hoten;
	private double diem;
	
	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	public void Nhap() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\tHọ và tên: ");
		hoten = scan.next();
		System.out.print("\tĐiểm: ");
		diem = scan.nextDouble();
	}
	
	public void Xuat() {
			if(diem<5) {
				System.out.printf("%s\t%f\tYếu", hoten, diem);
			}
			else if(diem>=5 && diem<6.5) {
				System.out.printf("%s\t%f\tTrung bình", hoten, diem);
			}
			else if(diem>=6.5 && diem<7.5) {
				System.out.printf("%s\t%f\tKhá", hoten, diem);
			}
			else if(diem>=7.5 && diem<9) {
				System.out.printf("%s\t%f\tGiỏi", hoten, diem);
			}
			else {
				System.out.printf("%s\t%f\tXuất sắc", hoten, diem);
			}
	}

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập số lượng sinh viên muốn thêm: ");
		n = scan.nextInt();
		Bai4[] SVList = new Bai4[n];
		for(int i=0; i<n; i++) {
			SVList[i] = new Bai4();
			System.out.printf("Sinh viên thứ %d: \n", i+1);
			SVList[i].Nhap();
		}
		
		System.out.println("\nThông tin sinhh viên vừa nhập:");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(SVList[i].getDiem() > SVList[j].getDiem()) {
					Bai4 t = SVList[i];
					SVList[i] = SVList[j];
					SVList[j] = t;
				}
			}
		}
		for(int i=0; i<n; i++) {
			SVList[i].Xuat();
			System.out.println();
		}
		scan.close();
	}

}
