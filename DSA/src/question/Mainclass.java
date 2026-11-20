package question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Mainclass {
	//column creation
	private final static int ID=0;
	private final static int NAME=1;
	private final static int SALARY=2;
	private final static int  DESIGNATION=3;
	private final static int  EXP=4;
	private final static int  LOCATION=5;
	private final static int GENDER=6;
	
	//2d array creation and insertion
	private    String[][] employee= { { "101", "Asha", "85000", "Java Full Stack Developer", "5", "Hyderabad", "Female" },
			{ "102", "Rahul", "92000", "Backend Developer", "7", "Bengaluru", "Male" },
			{ "103", "Sneha", "98000", "Java Full Stack Developer", "6", "Hyderabad", "Female" },
			{ "104", "Kiran", "76000", "Java Full Stack Developer", "4", "Hyderabad", "Male" },
			{ "105", "Divya", "88000", "QA Engineer", "8", "Chennai", "Female" },
			{ "106", "Arjun", "105000", "Technical Lead", "10", "Pune", "Male" },
			{ "107", "Priya", "91000", "Java Full Stack Developer", "9", "Hyderabad", "Female" }, };
	     
 public void high(String[][] employee) {
	 String[] result=Arrays.stream(employee).max(Comparator.comparingInt(e->Integer.parseInt(e[SALARY]))).get();
	 System.out.println("highest salary details:");
	 for(String x:result) {
		 System.out.println(x);
	 }
	 
 }
	 

	
	
	public static void main(String[] args) {
		Mainclass m=new Mainclass();
		m.high(m.employee);
	}
	  
	
		
}
		
		
		















	


