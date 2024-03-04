
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class ManHinhChinh extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKetQua;

	public ManHinhChinh() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Chương trình tính toán đơn giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 755, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất (a)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(61, 62, 179, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai (b)");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(61, 139, 179, 36);
		contentPane.add(lblNhpSTh);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(236, 65, 402, 36);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(236, 139, 402, 36);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("Cộng");
        btnCong.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HamXuLyCong();
            }
        });
        btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnCong.setBounds(127, 245, 103, 50);
        contentPane.add(btnCong);
		
        JButton btnTru = new JButton("Trừ");
        btnTru.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HamXuLyTru();
            }
        });
        btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnTru.setBounds(264, 245, 103, 50);
        contentPane.add(btnTru);
		
        JButton btnNhan = new JButton("Nhân");
        btnNhan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HamXuLyNhan();
            }
        });
        btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNhan.setBounds(397, 245, 103, 50);
        contentPane.add(btnNhan);
		
        JButton btnChia = new JButton("Chia");
        btnChia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HamXuLyChia();
            }
        });
        btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnChia.setBounds(535, 245, 103, 50);
        contentPane.add(btnChia);
		
		JLabel lblKtQuTnh = new JLabel("Kết Quả Tính Toán :");
		lblKtQuTnh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQuTnh.setBounds(61, 328, 179, 36);
		contentPane.add(lblKtQuTnh);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(236, 328, 402, 36);
		contentPane.add(txtKetQua);
	}
	void HamXuLyCong() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);	
		double tong = soA + soB;
		txtKetQua.setText(String.valueOf(tong));
	}
	void HamXuLyTru() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		double hieu = soA - soB;
		txtKetQua.setText(String.valueOf(hieu));
	}
	void HamXuLyNhan() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		double tich = soA * soB;
		txtKetQua.setText(String.valueOf(tich));
	}
	void HamXuLyChia() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		if (soB != 0) {
            double thuong = soA / soB;
            txtKetQua.setText(String.valueOf(thuong));
        } else {
            txtKetQua.setText("Ko chia dc cho 0");
        }
	}
}