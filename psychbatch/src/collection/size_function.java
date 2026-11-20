package collection;
public class size_function {
	static Object[] arr=new Object[10];
	static int count=0;
	static int size() {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=null)
				count++;
			
		}
		return count;
	}
	public static void main(String[] args) {
		arr[0]=10;
		arr[1]=20.5;
		arr[2]="hello";
		System.out.println("no of ele i can store"+arr.length);
		System.out.println("no is present in array"+size());
				
	}
	
	

}
