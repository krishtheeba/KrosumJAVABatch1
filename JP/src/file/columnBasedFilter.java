package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class columnBasedFilter {

	public static void main(String[] args) {
		String fname="C:\\Users\\Karthik\\eclipse-workspace\\JP\\src\\file\\employee.csv";
		String line, dept;
			
		try(BufferedReader br = new BufferedReader(new FileReader(new File(fname)));
				Scanner in= new Scanner(System.in);){
			
			System.out.println("ENTER DEPT");
			dept= in.next();
			for(int i=1;(line=br.readLine())!=null;i++)
				if(line.matches("(?i).*"+dept+".*"))
					System.out.println("Line number : " + i +line);
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
