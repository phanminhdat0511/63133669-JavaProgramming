
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class ManHinhGiaiPTBac2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNhapa;
	private JTextField txtNhapb;
	private JTextField txtKetQua;
	private JTextField txtNhapc;

	public ManHinhGiaiPTBac2() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Chương trình giải PT Bậc 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 866, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNhapa = new JLabel("Nhập a:");
		lblNhapa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhapa.setBounds(127, 65, 76, 36);
		contentPane.add(lblNhapa);
		
		JLabel lblNhapb = new JLabel("Nhập b:");
		lblNhapb.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhapb.setBounds(127, 118, 76, 36);
		contentPane.add(lblNhapb);
		
		txtNhapa = new JTextField();
		txtNhapa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNhapa.setBounds(225, 70, 355, 26);
		contentPane.add(txtNhapa);
		txtNhapa.setColumns(10);
		
		txtNhapb = new JTextField();
		txtNhapb.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNhapb.setColumns(10);
		txtNhapb.setBounds(225, 123, 355, 26);
		contentPane.add(txtNhapb);
		
		JButton btnGiai = new JButton("GIẢI");
        btnGiai.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GiaiPTBac2();
            }
        });
        btnGiai.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnGiai.setBounds(326, 302, 103, 50);
        contentPane.add(btnGiai);
		
		JLabel lblKetQua = new JLabel("Kết quả:");
		lblKetQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKetQua.setBounds(127, 232, 76, 36);
		contentPane.add(lblKetQua);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(225, 232, 435, 36);
		contentPane.add(txtKetQua);
		
		JLabel lblNhapc = new JLabel("Nhập c:");
		lblNhapc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhapc.setBounds(127, 175, 76, 36);
		contentPane.add(lblNhapc);
		
		txtNhapc = new JTextField();
		txtNhapc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNhapc.setColumns(10);
		txtNhapc.setBounds(225, 180, 355, 26);
		contentPane.add(txtNhapc);
	}
	void GiaiPTBac2() {
			double a = Double.parseDouble(txtNhapa.getText());
            double b = Double.parseDouble(txtNhapb.getText());
            double c = Double.parseDouble(txtNhapc.getText());

            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                txtKetQua.setText("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                txtKetQua.setText("Phương trình có nghiệm kép: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                txtKetQua.setText("x1 = " + x1 + ", x2 = " + x2);
            }
	}
}