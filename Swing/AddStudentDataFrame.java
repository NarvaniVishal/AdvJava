package mypack;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddStudentDataFrame extends JFrame {
	
	JTextField txtName,txtMarksJava,txtMarksSL,txtSearch;
	JButton btnSave,btnSearch;
	JLabel lblMsg;
	ArrayList<Student> arrListStus;
	

	public AddStudentDataFrame() {
		txtName =  new JTextField(10);
		txtMarksJava = new JTextField(10);
		txtMarksSL =  new JTextField(10);
		txtSearch =  new JTextField(10);
		btnSave = new JButton("Save");
		btnSearch = new JButton("Search");
		lblMsg = new JLabel();
		arrListStus = new ArrayList<Student>();
		add(txtName);
		add(txtMarksJava);
		add(txtMarksSL);
		add(btnSave);
		add(txtSearch);
		add(btnSearch);
		add(lblMsg);
		lblMsg.setForeground(Color.red);
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String strName = txtName.getText();
				int marksJava  = Integer.parseInt(txtMarksJava.getText());
				int marksSL  = Integer.parseInt(txtMarksSL.getText());
				//1. Create Student
				Student newStu = new Student();
				
				//2.  Assign values
				newStu.name = strName;
				newStu.marksJava = marksJava;
				newStu.marksSL = marksSL;
				
				//3. Add stu to arraylist
				arrListStus.add(newStu);
				lblMsg.setText("Total Students : " + arrListStus.size());
				
				
			
			}
		});
		
		btnSearch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String strSearch = txtSearch.getText();
				for (Student student : arrListStus) {
					if(student.name.equals(strSearch))
					{
						lblMsg.setText(student.getPercentage()+"");
						break;
					}
				}
			}
		});
		// TODO Auto-generated constructor stub
	}

}
