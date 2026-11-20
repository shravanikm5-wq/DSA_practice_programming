package polymoephism;
class flims{
	void fea() {
		System.out.println("movies");
		
	}
}
	class comedy extends flims{
		void fea() {
			System.out.println("drama");
			
		}
		
	}
	class romantic extends flims{
		void fea() {
			System.out.println("toxic");
			
		}
	}
		class action extends flims{
			void fea() {
				System.out.println("kgf");
				
         }
     }
		class Stimulator4{
			static void buy1(flims l1) {
				l1.fea();
			}
		}


public class mains6 {
	public static void main(String[] args) {
		  comedy m1 = new comedy();
		  romantic r1 = new romantic();
		  action t1 = new action();
		  Stimulator4.buy1(m1);
		  Stimulator4.buy1(r1);
		  Stimulator4.buy1(t1);


		}


}
