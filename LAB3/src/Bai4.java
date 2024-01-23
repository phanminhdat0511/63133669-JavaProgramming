import java.util.Scanner;

public class Bai4 {
	
	public void Nhap(String[] hoten, double[] diem, int n) {
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<n; i++) {
			System.out.printf("\nSinh viên thứ %d:\n", i);
			System.out.print("\tHọ và tên: ");
			hoten[i] = scan.next();
			System.out.print("\tĐiểm: ");
			diem[i] = scan.nextDouble();
		}
		scan.close();
	}
	
	public void Xuat(String[] hoten, double[] diem, int n) {
		System.out.println("Thông tin của các sinh viên vừa nhập:");
		for(int i=0; i<n; i++) {
			if(diem[i] <5) {
				System.out.printf("%s\t%f\tYếu\n", hoten[i], diem[i]);
			}
			else if(diem[i]>=5 && diem[i]<6.5) {
				System.out.printf("%s\t%f\tTrung bình\n", hoten[i], diem[i]);
			}
			else if(diem[i]>=6.5 && diem[i]<7.5) {
				System.out.printf("%s\t%f\tKhá\n", hoten[i], diem[i]);
			}
			else if(diem[i]>=7.5 && diem[i]<9) {
				System.out.printf("%s\t%f\tGiỏi\n", hoten[i], diem[i]);
			}
			else {
				System.out.printf("%s\t%f\tXuất sắc\n", hoten[i], diem[i]);
			}
		}
	}

	public static void main(String[] args) {
		
		Bai4 SVList = new Bai4();
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập số lượng sinh viên muốn thêm: ");
		n = scan.nextInt();
		double[] diem = new double[n];
		String[] hoten = new String[n];
		SVList.Nhap(hoten, diem, n);
		SVList.Xuat(hoten, diem, n);
		scan.close();
	}

}
