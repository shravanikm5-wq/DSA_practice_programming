package dsa_assignment;

public class charts {
	String name;
	int qty;
	String size;
	public charts(String name) {
		this(name,1);
	}
	public charts(String name,int qty) {
		this(name,qty,"small");
	}
	public charts(String name,int qty,String size) {
		this.name=name;
		this.qty=qty;
		this.size=size;
	}
	public static void main(String[] args) {
		charts p=new charts("masalapuri");
		System.out.println(p.name+" "+p.qty+" "+p.size);
		
	}

}
