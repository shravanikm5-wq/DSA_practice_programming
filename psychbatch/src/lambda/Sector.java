package lambda;
	interface Area8 {
		double print(int r);
	}

	public class Sector {
		public static void main(String[] args) {

			Area8 a = (x) -> {
				double theta = 60;
				return 0.5 * x * x * theta;
			};

			System.out.println(a.print(6));
		}
	}
	
	