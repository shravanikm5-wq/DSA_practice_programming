package collection;

public class A_insert_index2 {
	static Object[] arr=new Object[10];
	static int index=0;
	static void add(Object obj) {
		arr[index]=obj;
		index++;
	}
	static void add(Object obj,int index) {
		System.arraycopy(arr, 2, arr, 3,3);
		arr[index]=obj;
	}
	static void printing() {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=null)
				System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		add(10);
		add(20);
		printing();
		add(30);
		add('a',2);
		System.out.println("*****b4******");
		printing();
	}
}
