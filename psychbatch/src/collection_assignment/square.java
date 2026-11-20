package collection_assignment;

public class square {
	static Object[] arr= {1,2,3,5,7,8};
	static void area(Object[] obj) {
		for (int i = 0; i < obj.length; i++) {
			int a = (int)obj[i];
//			int a = (int)obj[i];
			double res=0.5*a*a;
			System.out.println(res);
			
		}
	}
	public static void main(String[] args) {
		area(arr);	
	}
}
