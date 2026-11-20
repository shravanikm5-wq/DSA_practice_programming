package dsa_assignment;

public class icecream {
	String name;
	int qty;
	String size;
	public icecream(String name) {
		this(name,1);
	}
	public icecream(String name,int qty) {
		this(name,qty,"small");
	}
	public icecream(String name,int qty,String size) {
		this.name=name;
		this.qty=qty;
		this.size=size;
	}
	public static void main(String[] args) {
		icecream p=new icecream("chocolate");
		System.out.println(p.name+" "+p.qty+" "+p.size);
		
	}

}
