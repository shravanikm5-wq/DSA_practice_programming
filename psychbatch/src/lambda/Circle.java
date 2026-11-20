package lambda;


	interface Area {
		void print();
	}

	public class Circle {
		public static void main(String[] args) {

			Area a = () -> {
				int r = 5;
				System.out.println(3.14 * r * r);
			};

			a.print();
		}
	}
	