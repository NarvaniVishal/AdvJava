package mypack;

public class Student {
	String name;
	int marksJava;
	int marksSL;
	public Student() {
		// TODO Auto-generated constructor stub
		name="";
		marksJava = 0;
		marksSL = 0;
	}
	float getPercentage() {
		
		float perc = (marksJava + marksSL)/2;
		return perc;
	}
}
