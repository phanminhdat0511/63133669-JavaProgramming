package PTB2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class view extends JFrame {
	private JTextField textFieldA;
	private JTextField textFieldB;
	private JTextField textFieldC;
	private JButton btnKetQua;
	private JTextArea ketQua;
	
	public view() {
		setTitle("Giải phương trình bậc 2"); 
		JLabel labelA = new JLabel("a: ");
		JLabel labelB = new JLabel("b: ");
		JLabel labelC = new JLabel("c: ");
		//thiết lập các chỉ số của các label(chiều ngang, chiều dọc, rộng, cao)
		labelA.setBounds(20, 50, 30, 20); 
        labelB.setBounds(100, 50, 30, 20);
        labelC.setBounds(180, 50, 30, 20);
		
		textFieldA = new JTextField();
		textFieldB = new JTextField();
		textFieldC = new JTextField();
		textFieldA.setBounds(40, 50, 40, 20);
        textFieldB.setBounds(120, 50, 40, 20);
        textFieldC.setBounds(200, 50, 40, 20);
        
        btnKetQua = new JButton("Kết quả");
        btnKetQua.setBounds(20, 80, 80, 30);
        
        ketQua = new JTextArea();
        ketQua.setBounds(20, 120, 350, 150);
        
        //add các đối tượng vào jframe
        add(labelA);
        add(labelB);
        add(labelC);
        add(textFieldA);
        add(textFieldB);
        add(textFieldC);
        add(btnKetQua);
        add(ketQua);
		
        setLayout(null);
        setSize(450, 400);
        setVisible(true);
	}

	public JTextField getTextFieldA() {
		return textFieldA;
	}

	public void setTextFieldA(JTextField textFieldA) {
		this.textFieldA = textFieldA;
	}

	public JTextField getTextFieldB() {
		return textFieldB;
	}

	public void setTextFieldB(JTextField textFieldB) {
		this.textFieldB = textFieldB;
	}

	public JTextField getTextFieldC() {
		return textFieldC;
	}

	public void setTextFieldC(JTextField textFieldC) {
		this.textFieldC = textFieldC;
	}

	public JButton getBtnKetQua() {
		return btnKetQua;
	}

	public void setBtnKetQua(JButton btnKetQua) {
		this.btnKetQua = btnKetQua;
	}

	public JTextArea getKetQua() {
		return ketQua;
	}

	public void setKetQua(JTextArea ketQua) {
		this.ketQua = ketQua;
	}
	
	
}
