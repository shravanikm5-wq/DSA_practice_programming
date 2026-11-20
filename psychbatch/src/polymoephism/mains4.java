package polymoephism;
class mobile1{
	void fea() {
		System.out.println("brand");
		
	}
}
	class redmi extends mobile1{
		void fea() {
			System.out.println("good");
			
		}
		
	}
	class oppo extends mobile1{
		void fea() {
			System.out.println("black");
			
		}
	}
		class vivo extends mobile1{
			void fea() {
				System.out.println("better");
				
         }
     }
		class Stimulator2{
			static void buy(mobile1 l1) {
				l1.fea();
			}
		}



public class mains4 {
	public static void main(String[] args) {
		  redmi m1 = new redmi();
		  oppo r1 = new oppo();
		  vivo t1 = new vivo();
		  Stimulator2.buy(m1);
		  Stimulator2.buy(r1);
		  Stimulator2.buy(t1);


		}

}
