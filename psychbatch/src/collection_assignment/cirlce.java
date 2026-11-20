package collection_assignment;

public class cirlce {
	static Object[] arr= {1,2,3,5,7,8};
	static void area(Object[] obj) {
		for (int i = 0; i < obj.length; i++) {
			int r = (int)obj[i];
			double res=3.14*r*r;
			System.out.println(res);
			
		}
	}
	public static void main(String[] args) {
		area(arr);	
	}
}
