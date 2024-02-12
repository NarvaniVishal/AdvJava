package mypack;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuFrame extends JFrame {
	JMenuBar menuBar;
	JMenu menu1,menu2,subMenu;
	
	
	JMenuItem menuItem1,menuItem2,subMenuItem1,subMenuItem2,subMenuItem3;
	
	JLabel lbl;
	public MenuFrame() {
		menuBar = new JMenuBar();
		menu1 = new JMenu("File");
		menu2 = new JMenu("Edit");
		subMenu = new JMenu("Open");
		menuItem1 = new JMenuItem("New");
		menuItem2 = new JMenuItem("Save");
		subMenuItem1 = new JMenuItem("Open PDF");
		subMenuItem2 = new JMenuItem("Open DOC");
		subMenuItem3 = new JMenuItem("Open Frame");
		lbl = new JLabel("Error message");
		add(lbl);
		
		setJMenuBar(menuBar);
		
		menuBar.add(menu1);
		menuBar.add(menu2);
	
		menu1.add(menuItem1);
		menu1.add(menuItem2);
		menu1.add(subMenu);

		subMenu.add(subMenuItem1);
		subMenu.add(subMenuItem2);
		subMenu.add(subMenuItem3);
		
		subMenuItem3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			System.out.println("SubMenuItem Clicked");
			lbl.setText("Succesful login : )");
			NewFrame objFrame = new NewFrame();
			objFrame.setTitle("New Frame");
	 		objFrame.setSize(400,400);
			objFrame.setLayout(new FlowLayout());
			objFrame.setVisible(true);
			}
		});
		
		
		
		
		
		
		
		
		
  		// TODO Auto-generated constructor stub
	}
}
