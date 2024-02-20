package mypack;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ViewDataFrame extends JFrame {
	
	JTextArea txtNames;
	public ViewDataFrame(ArrayList<Student> arrList) {
		txtNames = new JTextArea(25,25);
		add(txtNames);
		String names="";
		for (Student student : arrList) {
			
			names+=student.name+"\n";
		}
		txtNames.setText(names);
		
		System.out.println("Size: " +  arrList.size());
		// TODO Auto-generated constructor stub
	}
}
