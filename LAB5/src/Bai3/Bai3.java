package Bai3;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Bai3 {
	private String tenSP;
	private double giaSP;

	public Bai3(String tenSP, double giaSP) {
		this.tenSP = tenSP;
		this.giaSP = giaSP;
	}
	
	public String getTenSP() {
		return tenSP;
	}

	public double getGiaSP() {
		return giaSP;
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String tenSP;
		double giaSP;
		
		ArrayList<Bai3> SPList = new ArrayList<>();
		/*1. Thêm thông tin sản phẩm*/
		int soLuong;
		System.out.print("Nhập số lượng sản phẩm muốn thêm: ");
		soLuong = scan.nextInt();
		for(int i=0; i<soLuong; i++) {
			System.out.printf("Sản phẩm %d:\n", i);
			System.out.print("Tên sản phẩm: ");
			tenSP = scan.next();
			System.out.print("Giá sản phẩm: ");
			giaSP = scan.nextDouble();
			Bai3 SP = new Bai3(tenSP, giaSP);
			SPList.add(SP);
		}
		
		/*2. Xuất thông tin của các sản phẩm với giá giảm dần*/
		Collections.sort(SPList, (SP1, SP2) -> Double.compare(SP2.getGiaSP(), SP1.getGiaSP()));
		System.out.println("\nDanh sách sản phẩm sau khi sắp xếp theo giá giảm dần:");
		int i=0;
        for (Bai3 sp : SPList) {
            System.out.printf("Sản phẩm %d. %s - Giá: %.2f\n", i, sp.getTenSP(), sp.getGiaSP());
            i++;
        }
        
        /*3. Tìm và xóa thông tin sản phẩm*/
        String timTen;
        System.out.print("\nNhập tên sản phẩm muốn xóa: ");
        timTen = scan.next();
        boolean find = false;
        for( i=0; i<SPList.size(); i++) {
        	Bai3 sp = SPList.get(i);
        	if (timTen.equals(sp.getTenSP())) {
                // Nếu trùng, xóa sản phẩm khỏi danh sách và giảm chỉ số i đi 1 để không bỏ qua phần tử tiếp theo
                SPList.remove(i);
                find = true;
                i--;
            }
        }
        if(!find) 
        	System.out.println("Không tìm thấy sản phẩm!!");
        
        System.out.println("Danh sách sản phẩm sau khi xóa: ");
        i=0;
        for (Bai3 sp : SPList) {
            System.out.printf("Sản phẩm %d. %s - Giá: %.2f\n", i, sp.getTenSP(), sp.getGiaSP());
            i++;
        }
        
        /*4. Tính giá trung bình của các sản phẩm*/
        double sum=0;
        int count =0;
        for(Bai3 sp : SPList) {
        	sum += sp.getGiaSP();
        	count++;
        }
        System.out.printf("\nGiá trung bình của các sản phẩm: %f", (double)(sum/count));
        
	}
}
