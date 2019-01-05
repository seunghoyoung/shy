package window;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Game implements ActionListener{

	static JButton s, r, p;
	static JFrame f;
	
    public static void main(String[] args) {
		
    	f = new JFrame();
    	f.setTitle("³ªÀÇ °¡À§ ¹ÙÀ§ º¸");
    	f.setSize(500, 1000);

    	s = new JButton();
    	r = new JButton();
    	p = new JButton();
    	
    	ImageIcon icon1 = new ImageIcon("s.PNG");
    	ImageIcon icon2 = new ImageIcon("r.PNG");
    	ImageIcon icon3 = new ImageIcon("p.PNG");
    	
    	s.setIcon(icon1);
    	r.setIcon(icon2);
    	p.setIcon(icon3);
    	
    	FlowLayout flow = new FlowLayout();
    	f.setLayout(flow);
    	
    	f.add(s);
    	f.add(r);
    	f.add(p);
    	
    	Game game = new Game();
    	s.addActionListener(game);
    	r.addActionListener(game);
    	p.addActionListener(game);
    	
    	
    	
    	f.setVisible(true);
    	
    }
	
	//public static void main(String[] args) {
       //Game game = new Game();
 //      
	//}

	@Override
	public void actionPerformed(ActionEvent e) {
		Random random = new Random();
		int computer = random.nextInt(3);
		//0:°¡À§, 1: ¹ÙÀ§, 2: º¸
		
		
		if (e.getSource() == s) {
			if (computer == 0) {
				f.setTitle("ºñ°åÀ½");
			}
			if (computer == 1) {
				f.setTitle("ÄÄÇ»ÅÍ ½Â");
			}
			if (computer == 0) {
				f.setTitle("³»°¡ ½Â");
			}
		}
		if (e.getSource() == r) {
			if (computer == 0) {
				f.setTitle("ÄÄÇ»ÅÍ ½Â");
			}
			if (computer == 1) {
				f.setTitle("ºñ°åÀ½");
			}
			if (computer == 0) {
				f.setTitle("³»°¡ ½Â");
			}
			
			}
			
		if (e.getSource() == p) {
			if (computer == 0) {
				f.setTitle("ÄÄÇ»ÅÍ ½Â");
			}
			if (computer == 1) {
				f.setTitle("³»°¡ ½Â");
			}
			if (computer == 0) {
				f.setTitle("ÄÄÇ»ÅÍ ½Â");
			}
			
		}
		
	}

}
