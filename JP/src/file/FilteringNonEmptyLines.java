package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FilteringNonEmptyLines {

	public static void main(String[] args) {
	
		String fname="C:\\Users\\Karthik\\eclipse-workspace\\JP\\src\\file\\employee.csv";
		String s;
		
		try (BufferedReader br = new BufferedReader(new FileReader(new File(fname)));){
				
			System.out.println("\n Way 1: Using Regx \n");
			
			for(int i=1;(s=br.readLine())!=null;i++) 
			//Filtering Non-empty lines using RegX
				if(!s.matches("^\\s*$"))
					System.out.println(s);
			
			System.out.println("Assuring whether there is no empty lines at end");
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(new File(fname)));){
			
			System.out.println("\nWay 2: Using String.isEmpty() \n");
		
			for(int i=1;(s=br.readLine())!=null;i++) 		
			//Filtering Non-empty lines using String.isEmpty()
				if(!s.isEmpty())
					System.out.println(s);
			
			System.out.println("Assuring whether there is no empty lines at end");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
