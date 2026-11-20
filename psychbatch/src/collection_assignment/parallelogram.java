package collection_assignment;

public class parallelogram {
	static Object[] arr= {1,2,3,5,7,8};
	static void area(Object[] obj) {
		for (int i = 0; i < obj.length; i++) {
			int b = (int)obj[i];
			int h = (int)obj[i];
			double res=h*b;
			System.out.println(res);
			
		}
	}
	public static void main(String[] args) {
		area(arr);	
	}


}
