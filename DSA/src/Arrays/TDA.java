package Arrays;

import java.util.Iterator;

public class TDA {
	int[][]a;
	public TDA(int row,int col) {
		a=new int[row][col];
	    for (int r = 0; r < a.length; r++) {
	    	for (int c = 0; c < a.length; c++) {
	    		a[r][c]=Integer.MIN_VALUE;
				
			}
			
		}
	    System.out.println("Array is created");
	}
	//insert
	void insert(int r,int c,int v) {
		try {
			if(a[r][c]==Integer.MIN_VALUE) {
				a[r][c]=v;
				System.out.println("values inserted");
			}
			else {
				System.out.println("the value already exist");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid");
		}
	}
	//traversal
	 void traversal() {
		 for (int r = 0; r < a.length; r++) {
			 for (int c = 0; c < a.length; c++) {
				 System.out.print(a[r][c]+" ");
				
			}
			 System.out.println();
			
		}
	 }
	 //search by value
	 void searchbyvalue(int v) {
		 for (int r = 0; r < a.length; r++) {
			 for (int c = 0; c < a.length; c++) {
				 if(a[r][c]==v) {
					 System.out.println("the value found in "+r+","+c);
					 return;
				 }
			 }
			}
			 System.out.println("value not found");
			
	 }
	 //search by index
	 void searchbyindex(int r,int c) {
		 try {
			 if(a[r][c]!=Integer.MIN_VALUE) {
				 System.out.println(a[r][c]);
			 }
		 }
		 catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println("invalid index");
		 }
	 }
	 void deletebyvalue(int v) {
		 for (int r = 0; r < a.length; r++) {
			 for (int c = 0; c < a.length; c++) {
				 if(a[r][c]==v) {
					 a[r][c]=Integer.MIN_VALUE;
					 System.out.println("values deleted");
					 return;
				 }
				
			}
			 
		 }
		 System.out.println("the value not deleted");
		}
		 void deletebyindex(int r,int c) {
			 try {
				 if(a[r][c]!=Integer.MIN_VALUE){
					 a[r][c]=Integer.MIN_VALUE;
					 System.out.println("the value is deleted");
					 
				 }
			 }
				 
			 catch(ArrayIndexOutOfBoundsException e) {
				 System.out.println("invalid index");
			 }
			 
		 }
		 void delete() {
			 a=null;
			 System.out.println("array is deleted");
		 }
		 public static void main(String[] args) {
			TDA t=new TDA(3,3);
			t.insert(0, 0, 10);
			t.insert(0, 1, 20);
			t.insert(0, 2, 30);
			t.insert(1, 0, 40);
			t.insert(1, 1, 50);
			t.insert(1, 2, 60);
			t.insert(2, 0, 70);
			t.insert(2, 1, 80);
			t.insert(2, 2, 90);
			t.traversal();
			t.searchbyindex(0, 0);
			t.searchbyvalue(30);
			t.deletebyindex(1, 0);
			t.deletebyvalue(50);
			t.delete();
			
		}
	 }
	 
