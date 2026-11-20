package poy;

import polymoephism.lg;
import polymoephism.mobiles;
import polymoephism.reg;
import polymoephism.stimulator;
import polymoephism.tel;

class lg{
	void select() {
		System.out.println("colors");
		
	}
}
	class mobiles extends lg{
		void select() {
			System.out.println("blue");
			
		}
		
	}
	class reg extends lg{
		void select() {
			System.out.println("black");
			
		}
	}
		class tel extends lg{
			void select() {
				System.out.println("white");
				
			}
}
		class stimulator{
			static void buy(lg l1) {
				l1.select();
			}
		}

public class main1 {
	public static void main(String[] args) {
	  mobiles m1 = new mobiles();
	  reg r1 = new reg();
	  tel t1 = new tel();
	  stimulator.buy(m1);
	  stimulator.buy(r1);
	  stimulator.buy(t1);


	}

}

public class main2 {
	public static void main(String[] args) {
		  mobiles m1 = new mobiles();
		  reg r1 = new reg();
		  tel t1 = new tel();
		  stimulator.buy(m1);
		  stimulator.buy(r1);
		  stimulator.buy(t1);


		}

	}

}
