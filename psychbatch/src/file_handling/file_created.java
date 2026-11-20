package file_handling;

import java.io.File;
import java.io.IOException;

public class file_created {
	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\Users\\Admin\\Desktop\\jsp1.txt");
		if (f1.createNewFile()) {
			System.out.println("file is created");
			
		} else {
			System.out.println("file is not created");

		}
	}

}
