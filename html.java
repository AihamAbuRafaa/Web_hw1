package aa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class html {

	public static void main(String args[]) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you number of cols: \n");
		int num=sc.nextInt();
		String s ="";
		for(int i=0;i<num;i++)
		{
			s+="<div></div>\r\n";
		}
		String html ="<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<style>\r\n" + 
				"body,html{\r\n" + 
				"    height:100%;\r\n" + 
				"	margin: 0;\r\n" + 
				"}\r\n" + 
				".flex-container {\r\n" + 
				"  display: flex;\r\n" + 
				"  height:100%;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				".flex-container > div {\r\n" + 
				"  flex:1;\r\n" + 
				"}\r\n" + 
				".flex-container > div:nth-child(3n-5){\r\n" + 
				"    background-color: blue;\r\n" + 
				"}\r\n" + 
				".flex-container > div:nth-child(3n-1){\r\n" + 
				"    background-color: red;\r\n" + 
				"}\r\n" + 
				".flex-container > div:nth-child(3n+0){\r\n" + 
				"    background-color: green;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"</style>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<div class=\"flex-container\">\r\n" + 
				s +
				"</div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>\r\n" ;

		File file = new File("4.html");
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(file));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		writer.write(html); 
		if (writer != null) {
			writer.close();
		}

	}



}

