package polymoephism;
class train{
	void fea() {
		System.out.println("place");
		
	}
}
	class first extends train{
		void fea() {
			System.out.println("Mysore");
			
		}
		
	}
	class sleep extends train{
		void fea() {
			System.out.println("bangalore");
			
		}
	}
		class second extends train{
			void fea() {
				System.out.println("mangalore");
				
         }
     }
		class Stimulator3{
			static void buy(train l1) {
				l1.fea();
			}
		}


public class main5 {
	public static void main(String[] args) {
		  first m1 = new first();
		  sleep r1 = new sleep();
		  second t1 = new second();
		  Stimulator3.buy(m1);
		  Stimulator3.buy(r1);
		  Stimulator3.buy(t1);


		}

}
