package lambda;

	interface Area6 {
		int print();
	}

	public class Square {
		public static void main(String[] args) {

			Area6 a = () -> {
				int s = 5;
				return s * s;
			};

			System.out.println(a.print());
		}
	}


