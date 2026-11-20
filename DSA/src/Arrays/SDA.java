package Arrays;

public class SDA {


		int[]a;
		SDA(int size){
			a=new int[size];
			for (int i = 0; i < a.length; i++) {
				a[i]=Integer.MIN_VALUE;
			}
		}
		//creation
		public void insert(int index,int val) {
			try {
				if(a[index]==Integer.MIN_VALUE) {
					a[index]=val;
					System.out.println("The value is inserted");
				}
				else {
					System.out.println("Element exist");
				}
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid index");
			}
		}
		
		//traversal
		public void traversal() {
			for (int i = 0; i < a.length; i++) {
				if(a[i]!=Integer.MIN_VALUE)
				System.out.println(a[i]);
			}
		}
		public void searchByValue(int val) {
			for (int i = 0; i < a.length; i++) {
				if(a[i]==val) {
					System.out.println("The element found"+a[i]);
					return;
				}
				System.out.println("The value not found");
			}
		}	
		public void searchByIndex(int index) {
				try {
					if(a[index]!=Integer.MIN_VALUE) {
						System.out.println(a[index]);
						
					}
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Invalid index");
				}
			}
		public void deleteByvalue(int val) {
			for(int i=0;i<a.length;i++) {
				if(a[i]==val) {
					a[i]=Integer.MIN_VALUE;
					System.out.println("The value deleted");
					return;
				}
			}
			System.out.println("The value not found");
		
		
		}
		public void deleteByIndex(int index) {
			try {
				if(a[index]!=Integer.MIN_VALUE) {
					a[index]=Integer.MIN_VALUE;
					System.out.println("The value is deleted at index "+index);
				}
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid index");
			}
		}
			public void delete() {
				a=null;
				System.out.println("The array is deleted");
				}
			public static void main(String[] args) {
				
				SDA s=new SDA(5);
				s.insert(0, 10);
				s.insert(1, 20);
				s.insert(2, 30);
				s.insert(3, 40);
				s.insert(4, 50);
				s.insert(5, 60);
				s.traversal();
				s.searchByValue(30);
				s.searchByIndex(1);
				s.deleteByIndex(0);
				s.deleteByvalue(20);
				s.traversal();
				s.delete();
		}


	
}
