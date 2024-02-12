package mypack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class ChkRdoDemo extends JFrame {
	public ChkRdoDemo() {
		// TODO Auto-generated constructor stub

		ImageIcon icon = new ImageIcon("images/two.png");
		JButton btn = new JButton("Show Values");

		JCheckBox chk1 = new JCheckBox("Cricket", true);
		add(chk1);
		chk1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(chk1.isSelected());
			}
		});

		JCheckBox chk2 = new JCheckBox("Football");
		add(chk2);

		JCheckBox chk3 = new JCheckBox("Basketball");
		add(chk3);

		JCheckBox chk4 = new JCheckBox("Tennis");
		add(chk4);

		add(btn);

		ButtonGroup grpGender = new ButtonGroup();
		JRadioButton rd1 = new JRadioButton("Male");
		JRadioButton rd2 = new JRadioButton("Female");

		add(rd1);
		add(rd2);
		grpGender.add(rd1);
		grpGender.add(rd2);

		ButtonGroup grpSem = new ButtonGroup();
		JRadioButton rd3 = new JRadioButton("Sem-2");
		JRadioButton rd4 = new JRadioButton("Sem-4");

		grpSem.add(rd3);
		grpSem.add(rd4);
		add(rd3);
		add(rd4);

		rd1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (rd1.getModel().isSelected() == true) {
					System.out.println("Male");
				} else {
					System.out.println("Female");
				}
			}
		});
		rd2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (rd1.isSelected() == true) {
					System.out.println("Male");
				} else {
					System.out.println("Female");
				}
			}
		});

		JTextArea txtArea = new JTextArea(20, 20);
		add(txtArea);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String strTxt = "";

				if (chk1.isSelected() == true) {
					strTxt += "Cricket\n";
				}
				if (chk2.isSelected() == true) {
//				strTxt+="Football";
					strTxt = strTxt + "Football\n";
				}
				if (chk3.isSelected() == true) {
					strTxt += "Basketball\n";
				}
				if (chk4.isSelected() == true) {
					strTxt += "Tennis\n";
				}
				txtArea.setText(strTxt);

			}
		});

	}

}
