package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_write {
	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\Users\\Admin\\Desktop\\jsp1.txt");
		//FileWriter fr=new FileWriter(f1);
		FileWriter fr1=new FileWriter(f1,true);
		//fr.write("hiiii");
		//fr.write("hot");
		fr1.write("byee");
		fr1.flush();
		System.out.println("data is written...");
	}

}
