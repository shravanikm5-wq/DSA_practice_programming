package polymoephism;
class Amazon{
	void buy() {
		System.out.println("brand");
		
	}
}
	class Shoe extends Amazon{
		void buy() {
			System.out.println("puma");
			
		}
		
	}
	class Dress extends Amazon{
		void buy() {
			System.out.println("black");
			
		}
	}
		class Mobile extends Amazon{
			void buy() {
				System.out.println("white");
				
			}
}
		class Stimulator1{
			static void par(Amazon l1) {
				l1.buy();
			}
		}





public class main3 {
	public static void main(String[] args) {
		  Shoe m1 = new Shoe();
		  Dress r1 = new Dress();
		  Mobile t1 = new Mobile();
		  Stimulator1.par(m1);
		  Stimulator1.par(r1);
		  Stimulator1.par(t1);


		}

}
