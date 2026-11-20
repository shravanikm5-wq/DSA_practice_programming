package collection_assignment;

public class trapezoid {
	static Object[] arr= {1,2,3,5,7,8};
	static void area(Object[] obj) {
		for (int i = 0; i < obj.length; i++) {
			int b = (int)obj[i];
			int a = (int)obj[i];
			int h = (int)obj[i];
			
			double res=0.5*a+b*h;
			System.out.println(res);
			
		}
	}
	public static void main(String[] args) {
		area(arr);	
	}

}
