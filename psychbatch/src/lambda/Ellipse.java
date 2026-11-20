package lambda;



	interface Area2 {
		void print(int x);
	}

	public class Ellipse {
		public static void main(String[] args) {

			Area2 a = (x) -> {
				int b = 4;
				System.out.println(3.14 * x * b);
			};

			a.print(6);
		}


}
