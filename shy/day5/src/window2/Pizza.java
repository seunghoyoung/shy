package window2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.omg.PortableServer.POAPackage.AdapterAlreadyExists;
import java.awt.Font;

public class Pizza {

	JFrame f;
	JLabel top, count;
	JButton b1, b2, b3;
	JTextField total;
	int sum = 0 ;
	int combo = 0;
	int potato = 0;
	int bul = 0;
	
	JTextArea list; 
	private JLabel lblNewLabel;
	private final JButton btnNewButton = new JButton("\uB098\uB97C\uB20C\uB7EC\uC918");
	
	public Pizza() {
		f = new JFrame();
		f.setBackground(Color.RED);
		f.setFont(new Font("�޸ո���ü", Font.PLAIN, 12));
		f.setForeground(Color.RED);
		f.setSize(338, 227);
		top = new JLabel("<<<<<<<<<�ڹ� ���ڿ� ���Ű��� ȯ���մϴ�. �ݰ����ϴ�>>>>>>>");
		top.setFont(new Font("�޸ո���ü", Font.PLAIN, 12));
		top.setForeground(Color.RED);
		count = new JLabel("����");
		b1 = new JButton("�޺�����");
	    b2 = new JButton("������������");
	    b3 = new JButton("�Ұ������");
	    total = new JTextField(20);
	    
	    
	    FlowLayout flow = new FlowLayout();
	    f.getContentPane().setLayout(flow);
        list = new JTextArea(3, 30);
	    
	    
	    
	    f.getContentPane().add(top);
	    f.getContentPane().add(b1);
	    f.getContentPane().add(b2);
	    f.getContentPane().add(b3);
	    f.getContentPane().add(count);
	    f.getContentPane().add(total);
	    f.getContentPane().add(list);
	    
	    total.setBackground(Color.green);
	    b1.setForeground(Color.orange);
	    b2.setForeground(Color.orange);
	    b3.setForeground(Color.orange);
	    
	    lblNewLabel = new JLabel("\uCD1D\uACC4");
	    lblNewLabel.setForeground(Color.RED);
	    f.getContentPane().add(lblNewLabel);
	    btnNewButton.setBackground(Color.RED);
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		JOptionPane.showMessageDialog(null,"���� ���� �����̱���");
	    	}
	    });
	    f.getContentPane().add(btnNewButton);
	    
	    
	    
	    
	    
	    b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum+"");
				combo++;
				
				list.setText("�޺� ����:" + combo +"��\n"
						+"�������� ����:" + potato +"��\n"
						+"�Ұ�� ����;" +  bul +"��\n"
						);
			}
		});
	    
	    b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 sum++;
				 total.setText(sum+"");
				 potato++;
				 list.setText("�޺� ����:" + combo +"��\n" // �������� ������ �ǹ���
						 +"�������� ����:" + potato +"��\n"
						 +"�Ұ�� ����:" +  bul +"��\n"
						 );
			}
		});
	    b3.addActionListener(new ActionListener() {
	    	
	    	@Override
	    	public void actionPerformed(ActionEvent e) {
	    		sum++;
	    		total.setText(sum+"");
	    		bul++;
	    		list.setText("�޺� ����:" + combo +"��\n"
	    				+"�������� ����:" + potato +"��\n"
	    				+"�Ұ�� ����:" +  bul +"��\n"
	    				);
	    	}
	    });
	    
	    f.setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		Pizza p = new Pizza();
		
	}

}
