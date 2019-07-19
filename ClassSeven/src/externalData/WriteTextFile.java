package externalData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String[] args) throws IOException {
		String path="C:\\ABC\\J";
		File f=new File(path);
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("hi");
		bw.write("hello");
		System.out.println("writing complete");
		bw.close();
		

	}

}
