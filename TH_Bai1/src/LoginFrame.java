
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDangNhap;
	private JTextField txtMatKhau;

	
	public LoginFrame() {
		setTitle("ĐĂNG NHẬP HỆ THÔNG QUẢN LÝ BÁN HÀNG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDangNhap = new JLabel("TÊN ĐĂNG NHẬP:");
		lblDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDangNhap.setHorizontalAlignment(SwingConstants.CENTER);
		lblDangNhap.setBounds(23, 56, 159, 49);
		contentPane.add(lblDangNhap);
		
		JLabel lblMatKhau = new JLabel("MẬT KHẨU:");
		lblMatKhau.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatKhau.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMatKhau.setBounds(42, 115, 140, 39);
		contentPane.add(lblMatKhau);
		
		txtDangNhap = new JTextField();
		txtDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtDangNhap.setBounds(191, 64, 237, 32);
		contentPane.add(txtDangNhap);
		txtDangNhap.setColumns(10);
		
		txtMatKhau = new JTextField();
		txtMatKhau.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtMatKhau.setBounds(189, 118, 239, 32);
		contentPane.add(txtMatKhau);
		txtMatKhau.setColumns(10);
		
		JButton btnDangNhap = new JButton("ĐĂNG NHẬP");
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyDangNhap();
			}
		});
		btnDangNhap.setForeground(new Color(0, 0, 0));
		btnDangNhap.setBorderPainted(false);
		btnDangNhap.setBackground(new Color(255, 255, 255));
		btnDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDangNhap.setBounds(224, 193, 140, 39);
		contentPane.add(btnDangNhap);
	}
	
	public void XuLyDangNhap() {
		String Dangnhap = txtDangNhap.getText();
		String Matkhau = txtMatKhau.getText();
		if(Dangnhap.equals("63CNTT") && Matkhau.equals("123")) {
			HomeFrame home = new HomeFrame();
			home.setVisible(true);
			this.setVisible(false);
		} else {
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "Đăng nhập thất bại");
		}
	}
}