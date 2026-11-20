package Arrays;



public class student1 {
	student[]s;
	student1(int size){
		s=new student[size];
	}
	public void insert(int index,student val) {
		try {
			if(s[index]==null) {
				s[index]=val;
				System.out.println("value inserted");
			}
			else {
				System.out.println("position already occupied");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index");
		}
	}
public void traversal() {
	for(int i=0;i<s.length;i++) {
		if(s[i]!=null) {
			System.out.println(s[i]);
		}
	}
}

public void search(int id) {
	for(int i=0;i<s.length;i++) {
		if(s[i] != null && s[i].id==id) {
			System.out.println("student found at "+ i+"position");
			System.out.println(s[i]);
			return;
			
		}
	}
	System.out.println("student not found");
}

public void  serachbyindex(int index) {
	try {
		if(s[index]!= null) {
			s[index]=null;
			System.out.println("student deleted");
		}else {
			System.out.println("position is empty");
		}
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("invalid index");
	}
}

public void deletebyindex(int index) {
	try {
		if(s[index]!=null) {
			s[index]=null;
			System.out.println("student deleted");
		}else {
			System.out.println("position is empty");
		}
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("invalid index");
	}
}

public void deletebyI(int id) {
	for(int i=0;i<s.length;i++) {
		if(s[i]!=null && s[i].id==id) {
			s[i]=null;
			System.out.println("student deleted");
		}
	}
	System.out.println("student not found");
}
public void delete() {
	s=null;
	System.out.println("Array deleted");
}
public static void main(String[] args) {
	student1 obj=new student1(5);
	obj.insert(0, new student("Shravani",101,'a'));
	obj.insert(1, new student("Rakshitha",102,'b'));
	obj.insert(2, new student("Radhika",103,'c'));
	obj.insert(3, new student("Shrav",104,'d'));
	obj.traversal();
	obj.search(101);
	obj.serachbyindex(2);
	obj.deletebyI(102);
	obj.deletebyindex(2);
	obj.traversal();

	obj.delete();
}

}


