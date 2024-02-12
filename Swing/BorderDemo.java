package mypack;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class BorderDemo extends JFrame {
	public BorderDemo() {
		// TODO Auto-generated constructor stub
		
		Border bd1 = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
		Border bd2 = BorderFactory.createBevelBorder(BevelBorder.RAISED);
		Border bd3 = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		Border bd4 = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		Border bd5 = BorderFactory.createLineBorder(Color.red,5);
		Border bd6 = BorderFactory.createMatteBorder(5, 10, 15, 20, Color.red);
		Border bd7 = BorderFactory.createCompoundBorder();
		Border bd8 = BorderFactory.createEmptyBorder();
		
		JButton btn1 = new JButton("Button 1");
		JButton btn2 = new JButton("Button 2");
		JButton btn3 = new JButton("Button 3");
		JButton btn4 = new JButton("Button 4");
		JButton btn5 = new JButton("Button 5");
		JButton btn6 = new JButton("Button 6");
		JButton btn7 = new JButton("Button 7");
		btn7.setBackground(Color.red);
		btn7.setForeground(Color.red);

		ImageIcon ii = new ImageIcon("images/one.png");
		JButton btn8 = new JButton("Button 8",ii);
		btn8.setBackground(Color.red);
		btn8.setForeground(Color.red);

		
		btn1.setBorder(bd1);
		btn2.setBorder(bd2);
		btn3.setBorder(bd3);
		btn4.setBorder(bd4);
		btn5.setBorder(bd5);
		btn6.setBorder(bd6);
		btn7.setBorder(bd7);
		btn8.setBorder(bd8);
		
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("hello");
			}
		});
		JTextArea ta = new JTextArea("text",10,5);
		add(ta);	
		
	}
}
