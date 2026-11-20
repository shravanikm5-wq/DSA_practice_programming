package DSA;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class collection_string {

	

	public class array {
		public static void main(String[] args) {
			List<String> a= new ArrayList<String>(Arrays.asList("shravani","rakshitha","Radhika"));
			for(int i=0;i<a.size()-1;i++) {
				for(int j=0;j<a.size()-1-i;j++) {
					if(a.get(j).compareTo(a.get(j+1))>0) {
						String temp=a.get(j);
						a.set(j, a.get(j+1));
						a.set(j+1, temp);
					}
				}
			}
			System.out.println(a);
		}

	}
}
