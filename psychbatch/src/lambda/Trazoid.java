package lambda;

public class Trazoid {
	

	interface Area {
		void print(int a);
	}

 
		public static void main(String[] args) {

			Area x = (a) -> {
				int b = 10;
				int h = 6;
				System.out.println(0.5 * (a + b) * h);
			};

			x.print(8);
		}


}
