package menu;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
//��Ʈ�� ����Ʈ  o ����
public class ChinaFood extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	int count = 0;
	final int price = 5000;
	JLabel lblNewLabel_2;

	public ChinaFood() {
		getContentPane().setBackground(Color.YELLOW);
		getContentPane().setForeground(Color.WHITE);
		setSize(700, 450);
		setTitle("주문해주세요....");
	
	    ImageIcon icon = new ImageIcon("중국집.png");
	    		
		FlowLayout flow =new FlowLayout();
		getContentPane().setLayout(flow);
		
		JButton button_1 = new JButton("\uC9EC\uBF55");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				textField.setText(count+"");
				textField_1.setText(count*price+"");
				ImageIcon icon2 = new ImageIcon("«��.png");
				lblNewLabel_2.setIcon(icon2);
				
				
			}
		});
		button_1.setToolTipText("\uC9EC\uBF55 \uD558\uB098\uAC00 \uCD94\uAC00\uB428");
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("���� ��� Semilight", Font.BOLD, 18));
		button_1.setBackground(Color.ORANGE);
		getContentPane().add(button_1);
		
		JButton button = new JButton("\uC6B0\uB3D9");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				textField.setText(count+"");
				textField_1.setText(count*price+"");
				ImageIcon icon2 = new ImageIcon("�쵿.png");
				lblNewLabel_2.setIcon(icon2);
				
				
			}
		});
		button.setToolTipText("\uC6B0\uB3D9 \uD558\uB098\uAC00 \uCD94\uAC00\uB428");
		button.setForeground(Color.RED);
		button.setFont(new Font("���� ��� Semilight", Font.BOLD, 18));
		button.setBackground(Color.ORANGE);
		getContentPane().add(button);
		
		JButton btnNewButton = new JButton("\uC9DC\uC7A5\uBA74");
        btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				textField.setText(count+"");
				textField_1.setText(count*price+"");
				ImageIcon icon2 = new ImageIcon("¥���.png");
				lblNewLabel_2.setIcon(icon2);
				
				
			}
		});
		btnNewButton.setFont(new Font("���� ��� Semilight", Font.BOLD, 18));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setToolTipText("\uC9DC\uC7A5\uBA74 \uD558\uB098\uAC00 \uCD94\uAC00\uB428");
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uAC1C\uC218");
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uAE08\uC561");
		getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_2 = new JLabel("");
		getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setIcon(icon);
	
		setVisible(true);
	}
	
	
	public static void main (String[] args) {
	  ChinaFood china = new ChinaFood();

	}

		}
