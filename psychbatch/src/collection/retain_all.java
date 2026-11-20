package collection;
public class retain_all {
	static Object[] arr= {1,45,6,7,89,90};
	static Object[] abb= {5,6,8,9,3,89};
	static boolean contains(Object obj) {
		for(int i=0;i<abb.length;i++) {
			if(abb[i]!=null&& abb[i].equals(obj)) {
				return true;
			}
		}
	return false;	
}
	static void retainALL(Object obj){
		for(int i=0;i<arr.length;i++) {
			if(!contains(arr[i])) {
				arr[i]=null;
		}
	}
	}
 public static void main(String[] args) {
	 retainALL(arr);
	 for(int i=0;i<arr.length;i++) {
		 System.out.println(arr[i]);
	 }
	 for(int i=0;i<abb.length;i++) {
		 System.out.println(abb[i]);
	 }
}
}



