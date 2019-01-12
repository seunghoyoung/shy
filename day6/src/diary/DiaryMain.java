package diary;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class DiaryMain extends JFrame {
	private JTextField textField;
	private JTextField textField_1;

	public DiaryMain() {
		getContentPane().setBackground(Color.PINK);
		setTitle("나의 일기장 시작화면");
		setSize(400, 550);
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);
		
		JLabel lblNewLabel_3 = new JLabel("");
		getContentPane().add(lblNewLabel_3);
	    ImageIcon icon = new ImageIcon("일기장2.JPG");
		lblNewLabel_3.setIcon(icon);
		
		
		JLabel id = new JLabel("아이디:");
		id.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		id.setBackground(Color.PINK);
		getContentPane().add(id);
		
		textField = new JTextField();
		getContentPane().add(textField);
		textField.setColumns(20);
		
		JLabel pw = new JLabel("패스워드:");
		pw.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		getContentPane().add(pw);
		
		textField_1 = new JTextField();
		getContentPane().add(textField_1);
		textField_1.setColumns(20);
		
		JButton login = new JButton("로그인");
		login.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			    String sId = "root";
			    String sPw = "1234";
			    String gId = id.getText();
			    String gPw = pw.getText();
			    
			    if ((sId.equals(gId)) && (sPw.equals(gPw))) {
			         JOptionPane.showMessageDialog(null, "로그인 OK입니다");
				} else {  
					JOptionPane.showMessageDialog(null, "재입력해주세요");

				}
			    
				
			}
		});
		login.setForeground(Color.BLUE);
		login.setFont(new Font("굴림", Font.PLAIN, 14));
		getContentPane().add(login);
		
		JButton reset = new JButton("초기화");
		reset.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				id.setText("");
				pw.setText("");
				
			}
		});
		reset.setBackground(Color.RED);
		reset.setFont(new Font("굴림", Font.PLAIN, 14));
		getContentPane().add(reset);
		
		JLabel lblNewLabel = new JLabel("");
		getContentPane().add(lblNewLabel);
		
		
		setVisible(true);

	}

	public static void main(String[] args) {
		DiaryMain name = new DiaryMain();

	}

}
