package mypack;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {

	JTextField txtNo;
	JButton btnLogin;
	JLabel lblAns;
	public LoginFrame() {
		txtNo = new JTextField(20);
		add(txtNo);
		btnLogin = new JButton("Login");
		add(btnLogin);
		lblAns = new JLabel();
		add(lblAns);
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int no = Integer.parseInt(txtNo.getText());
				if(isPrime(no))
				{
					lblAns.setText("No is prime");
				}
				else
				{
					lblAns.setText("No is not prime");
				}
			}

		
		});
		// TODO Auto-generated constructor stub
	}
	
	public boolean isPrime(int no) {
		// TODO Auto-generated method stub
		
		int totalFactors = getFactors(no);
		
		if(totalFactors==2)
			return true;
		else
			return false;
	}
	public int getFactors(int no)
	{
		int totalFactors=0;
		for(int cntr=1;cntr<=no;cntr++)
		{
			if(no%cntr==0)
			{
				totalFactors++;
			}
		}
		return totalFactors;
	}
}








