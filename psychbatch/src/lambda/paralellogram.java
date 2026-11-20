package lambda;

public class paralellogram {

	interface Area7 {
		int print(int x);
	}


		public static void main(String[] args) {

			Area7 a = (x) -> {
				int h = 6;
				return x * h;
			};

			System.out.println(a.print(10));
		}
	}


