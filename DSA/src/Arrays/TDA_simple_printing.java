package Arrays;

import java.util.Iterator;

public class TDA_simple_printing 
{
	
		 static int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		//diagonal
//		for(int r=0;r<a.length;r++) {
//			for(int c=0;c<a[r].length;c++) {
//				if(r==c) {
//					System.out.print(a[r][c]+" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
		//
		void oddvalues() {
			for(int r=0;r<a.length;r++) {
				for(int c=0;c<a[r].length;c++) {
					if(a[r][c]%2==1) 
						System.out.println(a[r][c]);
					
					}
				}
			}
		
	
			void evenvalues() {
				for(int r=0;r<a.length;r++) {
					for(int c=0;c<a[r].length;c++) {
						if(a[r][c]%2==0) {
							System.out.println(a[r][c]);
						}
					}
				
			}
			
		}
			void diagonalsum() {
				int s=0;
				for(int i=0;i<a.length;i++) {
					s=s+a[i][i];
				}
				System.out.println(s);
			}
			
			void antidiagonal() {
				
				int s=0;
				for(int i=0;i<a.length;i++) {
					s=s+a[i][a.length-1-i];
				}
				System.out.println(s);
			}
			
			void rowsum() {
				for(int i=0;i<a.length;i++) {
					int sum=0;
					for(int j=0;j<a[i].length;j++) {
						sum=sum+a[i][j];
					}
					System.out.println(sum);
				}
				
			}
			void colsum() {
				for(int j=0;j<a[0].length;j++) {
					int sum=0;
					for(int i=0;i<a.length;i++) {
						sum=sum+a[i][j];
					}
					System.out.println(sum);
				}
				
			}
			
			public static void main(String[] args)
			{
				TDA_simple_printing t1= new TDA_simple_printing();
				//t1.oddvalues();
				//t1.evenvalues();
				//t1.rowsum();
				t1.colsum();
			
	}

}
