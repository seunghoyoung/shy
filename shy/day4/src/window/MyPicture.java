package window;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyPicture implements ActionListener{

	static JButton b1;
	static JButton b2;
	
	public static void main(String[] args) {
		JFrame f  = new JFrame();
		f.setTitle("���� �׷��� ���α׷�");
		f.setSize(900,700);
		
		JLabel l  = new JLabel("���� ��");
		JLabel l2 = new JLabel("�ֱ⵵ �־��");
		JLabel img  = new JLabel();
		ImageIcon icon = new ImageIcon("gom.JPG");
        FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		img.setIcon(icon);
		
		b1 = new JButton("���� ��������");
	    b2 = new JButton("���� �Ƕ� ��������");
		
		f.add(l);
		f.add(img);
		f.add(l2);
		f.add(b1);
		f.add(b2);
		
		MyPicture pic = new MyPicture();
		b1.addActionListener(pic);
		b2.addActionListener(pic);
		
        f.setVisible(true);
		
		//�������α׷��� �ߴ�, �ȵ���̵�� ��Ҵ�. 
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {System.out.println("���� �����̱���");
			
		} 
		if (e.getSource() == b2) {System.out.println("���� �Ƕ� �����̱���");
			
		} 
		
		
	}

}
