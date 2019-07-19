package externalData;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RWtext {
public static void main(String[]args) throws IOException {
	 // TODO Auto-generated method stub

		String path ="c:\\ABC\\J\\mywriterData.txt";
		
		File f=new File(path);
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
	System.out.println(br.readLine());
	
		//bw.close();
		//while((line=br
		//	System.out.println(Line);
		}}
		
	


