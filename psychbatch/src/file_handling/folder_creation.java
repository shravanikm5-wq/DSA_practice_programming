package file_handling;

import java.io.File;

public class folder_creation {
	public static void main(String[] args) {
	
		File f1=new File("C:\\Users\\Admin\\Desktop\\jsp.txt");
		if (f1.mkdirs()) {
			System.out.println("folder created");
			
		} else {
			System.out.println(" folder not created");

		}
		if (f1.exists()) {
			System.out.println("folder exist");
			
		} else {
			System.out.println("folder not exist");

		}
//		if(f1.delete()) {
//			System.out.println("folder is deleted");
//		}
//		else {
//			System.out.println("folder not deleted");
//		}
	}

}
