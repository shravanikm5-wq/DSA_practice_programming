package DSA;

import java.util.Arrays;

public class String1 {
	public static void main(String[] args) {
		String[] a= {"Radhika","Shravani","Rakshitha","Nivedan"};
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j].compareTo(a[j+1])>0) {
					String temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
