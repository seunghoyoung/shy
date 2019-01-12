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
import javax.swing.DropMode;

public class DiaryMain2 extends JFrame {
	private JTextField noText;
	private JTextField dateText;
	private JTextField titleText;
	private JTextField textField_3;

	public DiaryMain2() {
		getContentPane().setBackground(Color.GREEN);
		setTitle("나의 일기장 시작화면");
		setSize(400, 700);
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);
		ImageIcon icon = new ImageIcon("일기장.JPG");

		JLabel lblNewLabel_3 = new JLabel("");
		getContentPane().add(lblNewLabel_3);
		lblNewLabel_3.setIcon(icon);

		JLabel lblNewLabel_1 = new JLabel(">>>>>>>>>>>>>>>>오늘일기장을 작성합니다<<<<<<<<<<<<");
		getContentPane().add(lblNewLabel_1);

		JLabel no = new JLabel("번호");
		no.setFont(new Font("HY견고딕", Font.PLAIN, 14));
		no.setBackground(Color.PINK);
		getContentPane().add(no);

		noText = new JTextField();
		getContentPane().add(noText);
		noText.setColumns(30);

		JLabel date = new JLabel("날짜");
		date.setFont(new Font("HY견고딕", Font.PLAIN, 14));
		getContentPane().add(date);

		dateText = new JTextField();
		getContentPane().add(dateText);
		dateText.setColumns(30);

		JButton save = new JButton("임시저장");
		JLabel title = new JLabel("제목");
		title.setFont(new Font("HY견고딕", Font.PLAIN, 14));
		getContentPane().add(title);

		titleText = new JTextField();
		titleText.setColumns(30);
		getContentPane().add(titleText);

		JLabel label_1 = new JLabel("내용");
		label_1.setFont(new Font("HY견고딕", Font.PLAIN, 14));
		getContentPane().add(label_1);

		textField_3 = new JTextField();
		textField_3.setColumns(30);
		getContentPane().add(textField_3);
		save.setForeground(Color.BLUE);
		save.setFont(new Font("굴림", Font.PLAIN, 14));
		getContentPane().add(save);
		JButton read = new JButton("일기읽기");
		read.setForeground(Color.BLUE);
		read.setFont(new Font("굴림", Font.PLAIN, 14));
		getContentPane().add(read);

		JLabel lblNewLabel = new JLabel("");
		getContentPane().add(lblNewLabel);

		setVisible(true);

	}

	public static void main(String[] args) {
		DiaryMain2 name = new DiaryMain2();

	}

}
