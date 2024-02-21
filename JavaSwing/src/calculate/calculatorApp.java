package calculate;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculatorApp extends JFrame {
	private JLabel num1Label;
	private JLabel num2Label;
    private JTextField num1Field;
    private JTextField num2Field;
    private JButton sumButton;
    private JButton subButton;
    private JButton mulButton;
    private JButton divButton;
    private JTextArea resultLabel;

    public calculatorApp() {
        setTitle("Máy tính");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(300, 300);
        
        num1Label = new JLabel("A: ");
        num1Label.setBounds(35, 20, 100, 25);
        add(num1Label);
        
        num2Label = new JLabel("B: ");
        num2Label.setBounds(125, 20, 100, 25);
        add(num2Label);
        
        num1Field = new JTextField();
        num1Field.setBounds(50, 20, 60, 25);
        add(num1Field);

        num2Field = new JTextField();
        num2Field.setBounds(140, 20, 60, 25);
        add(num2Field);

        sumButton = new JButton("+");
        sumButton.setBounds(20, 50, 50, 25);
        add(sumButton);

        subButton = new JButton("-");
        subButton.setBounds(80, 50, 50, 25);
        add(subButton);

        mulButton = new JButton("*");
        mulButton.setBounds(140, 50, 50, 25);
        add(mulButton);

        divButton = new JButton("/");
        divButton.setBounds(200, 50, 50, 25);
        add(divButton);

        resultLabel = new JTextArea();
        resultLabel.setBounds(20, 80, 230, 50);
        add(resultLabel);

        sumButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('+');
            }
        });

        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('-');
            }
        });

        mulButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('*');
            }
        });

        divButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('/');
            }
        });
    }

    private void calculate(char operator) {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            String ketQua = null;
            double kq = 0;

            switch (operator) {
                case '+':
                    kq = num1 + num2;
                    ketQua = "A + B = " + kq;
                    break;
                case '-':
                    kq = num1 - num2;
                    ketQua = "A - B = " + kq;
                    break;
                case '*':
                    kq = num1 * num2;
                    ketQua = "A * B = " + kq;
                    break;
                case '/':
                	if(num2 != 0) {
                		kq = num1 / num2;
                		ketQua = "A / B = " + kq;
                	}
                	else
                		ketQua = "Không thể chia cho 0!!";
                    break;
            }

            resultLabel.setText(""+ ketQua);
    }

    public static void main(String[] args) {
                calculatorApp app = new calculatorApp();
                app.setVisible(true);
    }
}

