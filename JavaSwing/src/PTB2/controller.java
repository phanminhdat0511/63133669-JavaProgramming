package PTB2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 
import javax.swing.JOptionPane;

public class controller {
	private view view;
	private float a;
	private float b;
	private float c;
	
	public controller(view view) {
		 this.view = view;
	        view.getBtnKetQua().addActionListener((ActionListener) this);
	        view.addWindowListener(new WindowAdapter() {
	            @Override
	            public void windowClosing(WindowEvent e) {
	                System.exit(1);
	            }
	        });
	}
	
	private static String giaiPTB2(float a, float b, float c) {
		String ketQua = null;
		if(a==0) {
			if(b==0){	
				if(c==0)
					ketQua = "Phương trình vô số nghiệm";
				else
					ketQua = "Phương trình vô nghiệm";
			}
			else
				ketQua = "Phương trình có 1 nghiệm: " + (-c/b);
		}
		else {
			double delta = Math.pow(b, 2) - 4*a*c;
			if(delta < 0)
				ketQua = "Phương trình vô nghiệm";
			else if(delta == 0)
				ketQua = "Phương trình có nghiệm kép: " + -b/(2*a);
			else {
				ketQua = "Phương trình có 2 nghiệm phân biệt:\n" + "X1 = " + (-b+Math.sqrt(delta))/(2*a) + "\nX2 = " + (-b-Math.sqrt(delta))/(2*a);
			}
		}
		return ketQua;
	}
	
	public void actionPerformed(ActionEvent e) {
		 // Lấy giá trị từ các trường nhập liệu và chuyển đổi thành số
	    float a = Float.parseFloat(view.getTextFieldA().getText());
	    float b = Float.parseFloat(view.getTextFieldB().getText());
	    float c = Float.parseFloat(view.getTextFieldC().getText());
	    
	    // Gọi phương thức giaiPTB2 với các giá trị đã lấy được
	    String ketQua = giaiPTB2(a, b, c);
	    
	    // Hiển thị kết quả trên JTextArea của view
	    view.getKetQua().setText(ketQua);
    }

	public view getView() {
		return view;
	}

	public void setView(view view) {
		this.view = view;
	}
	

}
