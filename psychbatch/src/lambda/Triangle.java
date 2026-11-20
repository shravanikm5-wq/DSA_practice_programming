package lambda;


	interface Area1 {
		void print();
	}

	public class Triangle {
		public static void main(String[] args) {

			Area1 a = () -> {
				int b = 10;
				int h = 6;
				System.out.println(0.5 * b * h);
			};

			a.print();
		}
	}

