package collection;

public class remove_element {
	static Object[] arr= {10,20,30,40,50};
	static void remove(int index) {
		arr[index]=null;
	}
	static void printing() {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=null)
				System.out.println(arr[i]);
		}
	}
				static void remove(Object obj) {
					for (int i = 0; i < arr.length; i++) {
						if ((arr[i]!=null)&&(arr[i].equals(obj))) {
							arr[i]=null;
						}
						
					}
			
		}
	public static void main(String[] args) {
		printing();
		remove(2);
		System.out.println("*****b4*****");
		printing();
		remove((Object)10);
		System.out.println("****b4*****");
		printing();
	}

}
