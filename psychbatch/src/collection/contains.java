package collection;

public class contains {
	static Object[] arr=new Object[10];
	static int count=0;
	static int index=0;
	static void add(Object obj) {
		arr[index]=obj;
		index++;
	}
	static boolean contain(Object obj) {
		for (int i = 0; i < arr.length; i++) {
			if((arr[i]!=null)&&(arr[i].equals(obj))) {
				return true;
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		arr[0]="bangalore";
		arr[1]="goa";
		arr[2]="Mysore";
		arr[3]="manday";
		boolean x=contain("mysore");
		System.out.println(x);
	}

}
