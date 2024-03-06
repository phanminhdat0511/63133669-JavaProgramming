package PTB2;

import java.awt.EventQueue;
import java.lang.Math;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class xuly extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea textAreaA;
	private JTextArea textAreaB;
	private JTextArea textAreaC;
	private JTextArea textAreaKq;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public xuly() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNhpA = new JLabel("Nhập a:");
		lblNhpA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNhpA.setBounds(58, 39, 78, 38);
		contentPane.add(lblNhpA);
		
		JLabel lblNhpB = new JLabel("Nhập b:");
		lblNhpB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNhpB.setBounds(58, 87, 78, 38);
		contentPane.add(lblNhpB);
		
		JLabel lblNhpC = new JLabel("Nhập c:");
		lblNhpC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNhpC.setBounds(58, 135, 78, 38);
		contentPane.add(lblNhpC);
		
		textAreaA = new JTextArea();
		textAreaA.setBounds(132, 39, 195, 28);
		contentPane.add(textAreaA);
		
		textAreaB = new JTextArea();
		textAreaB.setBounds(132, 87, 195, 28);
		contentPane.add(textAreaB);
		
		textAreaC = new JTextArea();
		textAreaC.setBounds(132, 135, 195, 28);
		contentPane.add(textAreaC);
		
		JButton btnNewButton = new JButton("Xác nhận");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GiaiPTB2();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(161, 184, 148, 38);
		contentPane.add(btnNewButton);
		
		textAreaKq = new JTextArea();
		textAreaKq.setFont(new Font("Monospaced", Font.PLAIN, 16));
		textAreaKq.setBounds(132, 233, 422, 68);
		contentPane.add(textAreaKq);
		
		JLabel kq = new JLabel("Kết quả");
		kq.setFont(new Font("Tahoma", Font.PLAIN, 18));
		kq.setBounds(60, 239, 76, 22);
		contentPane.add(kq);
		
	}
	void GiaiPTB2() {
		double a = Double.parseDouble(textAreaA.getText());
		double b = Double.parseDouble(textAreaB.getText());
		double c = Double.parseDouble(textAreaC.getText());
		
		if(a == 0) {
			if(b == 0)
				textAreaKq.setText("Phương trình vô nghiệm");
			else
				textAreaKq.setText("Phương trình có 1 nghiệm duy nhất: " + (-c/b));
		}
		else {
			double delta = b*b - 4*a*c;
			if(delta <0)
				textAreaKq.setText("Phương trình vô nghiệm.");
			else if(delta == 0)
				textAreaKq.setText("Phương trình có nghiệm kép:" + (-b/(2*a)));
			else {
				double x1 = (-b + Math.sqrt(delta)) / 2*a;
				double x2 = (-b - Math.sqrt(delta)) / 2*a;
				textAreaKq.setText("Phương trình có 2 nghiệm phân biệt:\n" + "x1 = " + x1 + "\n" + "x2 = " + x2);
			}
		}
	}
}
