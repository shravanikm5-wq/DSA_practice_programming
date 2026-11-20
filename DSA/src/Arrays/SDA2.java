package Arrays;

public class SDA2 {
	String [] a;
	SDA2(int size){
		a=new String[size];
	}

		public void insert(int index,String val) {
			try {
				if(a[index]==null) {
					a[index]=val;
					System.out.println("value insert");
				}
				else {
					System.out.println("value is not insert");
				}
			
		}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("inavalid index");
			}
	}
		public void traversal() {
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
			}
		}
		public void search(String val) {
			for(int i=0;i<a.length;i++) {
				if(a[i].equals(val)) {
					System.out.println("tha val"+val+"found");
					return;
				}
			}
			System.out.println("the value not found");
		}
		public void searchbyindex(int index) {
			try {
				if(a[index]!=null) {
					System.out.println(a[index]);
				}
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("invalid index");
			}
		}
		public void deletebtvalue(String val) {
			for(int i=0;i<a.length;i++) {
				if(a[i].equals(val)) {
					a[i]=null;
					System.out.println("deleted");
					return;
				}
			}
			System.out.println("not deleted");
			
		}
		public void deletebyindex(int index) {
			try {
				if(a[index]!=null) {
					a[index]=null;
					System.out.println("the value"+index+" is deleted");
				}
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("invalid index");
			}
		}
		public void delete() {
			a=null;
			System.out.println("array is deleted");
		}
		public static void main(String[] args) {
			SDA2 s=new SDA2(4);
			s.insert(0, "krishna");
			s.insert(1, "rama");
			s.insert(2, "vishnu");
			s.insert(3, "hanuman");
			s.traversal();
			s.search("rama");
			s.searchbyindex(3);
			s.deletebtvalue("rama");
			s.deletebyindex(1);
			s.traversal();
			s.delete();
		}
}

