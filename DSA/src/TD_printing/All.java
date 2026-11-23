package TD_printing;

public class All {
	public static void main(String[] args) {
		int[][]a={ {1,2,3},{4,5,6},{7,8,9}};
		//row reversal
//		for (int r = 0; r < a.length; r++) {
//			for (int c= a[r].length-1;  c>=0;c--) {
//				System.out.print(a[r][c]);
//				
//			}
//			System.out.println();
//			
//		}
		// in place of row reversal
//		for (int r=0; r < a.length; r++) {
//			int  le=0; int re=a[r].length-1;
//			while(le<re) {
//				int temp=a[r][le];
//				a[r][le]=a[r][re];
//				a[r][re]=temp;
//				le++;re--;
//				
//			}
//			
//			
//		}
		//diagonal
//		for (int r = 0; r < a.length; r++) {
//			for (int c=0;c< a[r].length;c++) {
//				if(r==c)
//				System.out.print(a[r][c]);
//				
//			}
//			System.out.println();
//			
//		}
		///anti diagonal
//		 for (int r = 0; r < a.length; r++) {
//			for (int c=0;c< a[r].length;c++) {
//				if(r+c ==a.length-1)
//				System.out.print(a[r][c]);
//				
//			}
//			System.out.println();
//			
//		}
		 ///sum of all matrix elements
//		     int s=0; 
//		   for (int r = 0; r < a.length; r++) {
//			for (int c=0;c< a[r].length;c++) {
//			  s=s+a[r][c];
//				
//				
//			}
//			
//			System.out.println(s);
//			
//		
//		   }
//		 
		//reverse column
//		for (int r = a.length-1; r>=0 ; r--) {
//			for (int c = 0; c<a[r].length; c++) {
//				System.out.print(a[r][c]);
//				
//			}
//			System.out.println();
//		}
		
		// in place column reversal
//		for (int c=0; c < a[0].length; c++) {
//			int  top=0; int end=a[c].length-1;
//			while(top<end) {
//				int temp=a[top][c];
//				a[top][c]=a[end][c];
//				a[end][c]=temp;
//				top++;end--;
//				
//			}
//			
//			
//		}
		
		//transpose
//		 for (int r = 0; r < a.length; r++) {
//			for (int c = 0; c < a.length; c++) {
//				System.out.print(a[c][r]);
//				
//			}
//			System.out.println();
//		}
          
		//in place transpose
//		for (int r = 0; r < a.length; r++) {
//			for (int c = r+1; c<a[r].length; c++) {
//				int temp=a[r][c];
//				a[r][c]=a[c][r];
//				a[c][r]=temp;
//				
//				
//			}
//			
//		}
		
		// rotate 90 degree
//		for (int r = 0; r < a.length; r++) {
//			for (int c = a[r].length-1; c>=0;c--) {
//				System.out.print(a[c][r]+" ");
//				
//			}
//			System.out.println();
//			
//		}
		
		
		// in order clockwise rotation
//		for (int r = 0; r < a.length; r++) {
//			for (int c = r+1; c < a[r].length; c++) {
//				int temp=a[r][c];
//				a[r][c]=a[c][r];
//				a[c][r]=temp;
//				
//			}
//			
//		}
//		for (int r=0; r < a.length; r++) {
//			int  le=0; int re=a[r].length-1;
//			while(le<re) {
//				int temp=a[r][le];
//				a[r][le]=a[r][re];
//				a[r][re]=temp;
//				le++;re--;
//				
//			}
//			
//			
//		}
		
		//anticlockwise
		for (int r = 0; r < a.length; r++) {
			for (int c = r+1; c < a[r].length; c++) {
				int temp=a[r][c];
				a[r][c]=a[c][r];
				a[c][r]=temp;
				
			}
			
		}
		for (int c=0; c < a[0].length; c++) {
			int  top=0; int end=a[c].length-1;
			while(top<end) {
				int temp=a[top][c];
				a[top][c]=a[end][c];
				a[end][c]=temp;
				top++;end--;
				
			}
			
			
		}
		
		//----------------------------
		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[r].length; c++) {
				System.out.print(a[r][c]+"");
				
			}
			System.out.println();
			
		}
		
		
	}

}
