package dsa_assignment;

public class pizza {
	String name;
	int qty;
	String size;
	public pizza(String name) {
		this(name,1);
	}
	public pizza(String name,int qty) {
		this(name,qty,"small");
	}
	public pizza(String name,int qty,String size) {
		this.name=name;
		this.qty=qty;
		this.size=size;
	}
	public static void main(String[] args) {
		pizza p=new pizza("panner");
		System.out.println(p.name+" "+p.qty+" "+p.size);
		
	}

}
