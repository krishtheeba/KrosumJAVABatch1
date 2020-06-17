package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FilterLineEndWithSpace {

	public static void main(String[] args) {
		String fname="C:\\Users\\Karthik\\eclipse-workspace\\JP\\src\\file\\employee.csv";
		String s;
		
		try (BufferedReader br = new BufferedReader(new FileReader(new File(fname)));){
				
			
			for(int i=1;(s=br.readLine())!=null;i++) {
				
				//Filtering lines that end with space
				if(s.endsWith(" ")) {
					System.out.println("Line End with Space : " + s);
				}
				//Filtering Non-empty lines
				if(!s.matches("^\\s*$"))
					System.out.println(s);
				
			}System.out.println("end");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
