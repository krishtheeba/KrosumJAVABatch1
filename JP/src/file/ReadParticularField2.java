package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
// Retrieve Record with Field based Filter
public class ReadParticularField2 {

	public static void main(String[] args) {
		String fname="C:\\Users\\Karthik\\eclipse-workspace\\JP\\src\\file\\employee.csv";
		String line, emp;
			
		try(BufferedReader br = new BufferedReader(new FileReader(new File(fname)));
				Scanner in= new Scanner(System.in);){
			
			System.out.println("ENTER EMP NAME");
			emp= in.next();
			for(int i=1;(line=br.readLine())!=null;i++) 
				if(line.matches("(?i).*"+emp+".*")) 
					System.out.println("At line number: " + i+ " : " +line);
				else 
					continue;
			
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		

	}

}
