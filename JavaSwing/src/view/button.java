package view;

import javax.swing.JFrame;

public class button {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		//Chỉnh kích thước của cửa sổ
		jf.setSize(550, 400);
		//Đặt tên cho cửa sổ
		jf.setTitle("Ví dụ");
		//Thiết lập vị trí xuất hiện của cửa sổ
		jf.setLocation(300, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}

}
