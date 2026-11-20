package lambda;


	interface Area3 {
		int print();
	}

	public class Rectangle {
		public static void main(String[] args) {

			Area3 a = () -> {
				int l = 10;
				int b = 5;
				return l * b;
			};

			System.out.println(a.print());
		}
	

}
