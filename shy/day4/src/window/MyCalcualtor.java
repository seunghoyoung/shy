package window;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyCalcualtor implements ActionListener {

	static JLabel l1,l2,result;
	static JTextField t1,t2;
	static JButton plus;
	static JButton minus;
	static JButton mul;
	static JButton div;
	
	
	public static void main(String[] args) {
	    JFrame f = new JFrame();
	    f.setTitle("나의 계산기");
	    f.setSize(250,380);
	    
	    l1 = new JLabel("숫자1>>");
	    l2 = new JLabel("숫자2>>");
	    result = new JLabel("X");
	    Font font = new Font("궁서", Font.BOLD, 120);
	    result.setFont(font);
	    
	    t1 = new JTextField(15);
	    t1.setForeground(Color.red);
	    t1.setBackground(Color.blue);
	    
	    t2 = new JTextField(15);
	    t2.setForeground(Color.red);
	    t2.setBackground(Color.blue);
	    
	    plus = new JButton("<<<<<더하기>>>>>>>");
	    minus = new JButton("<<<<<<<빼기>>>>>>>");
	    mul = new JButton("<<<<<<곱하기>>>>>>");
	    div = new JButton("<<<<<<나누기>>>>>>");
	    plus.setForeground(Color.blue);
	    plus.setBackground(Color.YELLOW);
	    
	    FlowLayout flow = new FlowLayout();
	    f.setLayout(flow);
	    
	    f.add(l1);
	    f.add(t1);
	    f.add(l2);
	    f.add(t2);
	    f.add(plus);
	    f.add(minus);
	    f.add(mul);
	    f.add(div);
        f.add(result);	  
	    
	    MyCalcualtor cal = new MyCalcualtor();
	    plus.addActionListener(cal);
	    minus.addActionListener(cal);
	    mul.addActionListener(cal);
	    div.addActionListener(cal);
	    
	    f.setVisible(true);
	    
}

	@Override
	public void actionPerformed(ActionEvent e) {
		String n1 = t1.getText();
        System.out.println("입력한 숫자 1은" + n1);
        String n2 = t2.getText();
        System.out.println("입력한 숫자 2은" + n2);
                
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        
        if (e.getSource() == plus) {
        	// {System.out.println("두수의 합은"+ (num1 + num2));
	        result.setText(num1 + num2 + "");      		
	}
        if (e.getSource() == minus) {
        	//System.out.println("두수의 빼기는"+ (num1 - num2));
        	result.setText(num1 - num2 + "");      		
        
        }
        if (e.getSource() == mul) {
        	//System.out.println("두수의 곱하기는"+ (num1 * num2));
        	result.setText(num1 * num2 + "");      		
        
        }
        if (e.getSource() == div) {
        	//System.out.println("두수의 나누기은"+ (num1 / num2));
        	result.setText(num1 / num2 + "");      		
        
        }
        
        
        
        
        
        
      
        
        
		}
		
		
		}
			
		
		

