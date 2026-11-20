package Arrays;

public class student_2d1 {
	
		student_2d[][] s;
		public student_2d1( int row,int col) {
			s=new student_2d[row][col];
			
			System.out.println("2d array is created");
		}
		//insert
		public void insert( int c,int r,student_2d st) {
			try {
				if(s[r][c]==null) {
					s[r][c]=st;
				}
				else {
					System.out.println("value is already done");
				}
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("invalid");
			}
			
		}
		//traversal
		void traversal() {
			for(int r=0;r<s.length;r++) {
				for(int c=0;c<s.length;c++) {
					System.out.println((s[r][c]+" "));
		}
				System.out.println();
			}
		}
		//search
		void searchindex(int r,int c) {
			try {
				if(s[r][c]!=null) {
					System.out.println(s[r][c]+"found");
				}
				else {
					System.out.println("value not found");
				}
		
			
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("invalid index");
			}
		}
		//delete index
		void deleteindex(int r,int c) {
			try {
				if(s[r][c]!=null) {
					System.out.println(s[r][c]+"is deleted");
				}
				else {
					System.out.println("invalid");
				}
				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("invalid");
			}
			
		}
		public void delete() {
			System.out.println("array deleted");
			s=null;
		}
		public static void main(String[] args) {
			student_2d1 t=new student_2d1(2,2);
			t.insert(0, 0,new student_2d("shrav",1,'a'));
			t.insert(0, 1,new student_2d("shrav",1,'a'));
			t.insert(1, 0,new student_2d("shrav",1,'a'));
			t.insert(1, 1,new student_2d("shrav",1,'a'));
			t.traversal();
			t.searchindex(0, 0);
			t.deleteindex(0, 0);
			t.traversal();
			t.delete();
			
		}
	}


