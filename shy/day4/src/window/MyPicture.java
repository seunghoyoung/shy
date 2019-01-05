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
		f.setTitle("나의 그래픽 프로그램");
		f.setSize(900,700);
		
		JLabel l  = new JLabel("나의 곰");
		JLabel l2 = new JLabel("애기도 있어요");
		JLabel img  = new JLabel();
		ImageIcon icon = new ImageIcon("gom.JPG");
        FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		img.setIcon(icon);
		
		b1 = new JButton("나를 누르세요");
	    b2 = new JButton("나를 또또 누르세요");
		
		f.add(l);
		f.add(img);
		f.add(l2);
		f.add(b1);
		f.add(b2);
		
		MyPicture pic = new MyPicture();
		b1.addActionListener(pic);
		b2.addActionListener(pic);
		
        f.setVisible(true);
		
		//스윙프로그램을 했다, 안드로이드랑 닮았다. 
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {System.out.println("나를 누르셨군요");
			
		} 
		if (e.getSource() == b2) {System.out.println("나를 또또 누르셨군요");
			
		} 
		
		
	}

}
