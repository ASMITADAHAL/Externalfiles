package externalData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class RWproperties {
	public static void main(String[]args) throws IOException {
		String path="C:\\Users\\URMI\\eclipse-workspace\\A\\ClassSeven\\src\\externalData\\myData.properties";
		Properties myobj=new Properties();
		FileInputStream fs=new FileInputStream(path);
		myobj.load(fs);
        Student(myobj.getProperty("name"),myobj.getProperty("mark"),myobj.getProperty("subject"));
int StudentGrade=Integer.parseInt(myobj.getProperty("mark"));
		
		Student(myobj.getProperty("name"), StudentGrade, myobj.getProperty("subject"));
		
}

	private static void Student(String name, int studentGrade, String course) {
		// TODO Auto-generated method stub

		System.out.println("name");
		System.out.println("grade");
		System.out.println("course");
				
	
	}

				
		
		
	}

	


