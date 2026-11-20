package DSA;

public class employee_sort {
	public static void main(String[] args) {
		employee[] s= {new employee(12,"Shravani",9000),
				new employee(11,"rakshitha",9000),	
				new employee(10,"kavana",9000),	
				new employee(14,"lekhana",9000)	
	};
		System.out.println("sort name");
		for(employee e:s) {
			System.out.println(e);
		}
		for(int i=0;i<s.length-1;i++) {
			for(int j=0;j<s.length-1-i;j++) {
				if(s[j].name.compareTo(s[j+1].name)>0) {
					employee temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		System.out.println("sort id");
		for(employee e:s) {
			System.out.println(e);
		}
		
		for(int i=0;i<s.length-1;i++) {
			for(int j=0;j<s.length-1-i;j++) {
				if(s[j].id>(s[j+1].id)) {
					employee temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		System.out.println("sort name");
		for(employee e:s) {
			System.out.println(e);
		}

}
}
