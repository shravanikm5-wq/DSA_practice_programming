package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class array {
	public static void main(String[] args) {
		List<Integer> a= new ArrayList<Integer>(Arrays.asList(9,8,5,2,3,1));
		for(int i=0;i<a.size()-1;i++) {
			for(int j=0;j<a.size()-1-i;j++) {
				if(a.get(j)>a.get(j+1)) {
					int temp=a.get(j);
					a.set(j, a.get(j+1));
					a.set(j+1, temp);
				}
			}
		}
		System.out.println(a);
	}

}
