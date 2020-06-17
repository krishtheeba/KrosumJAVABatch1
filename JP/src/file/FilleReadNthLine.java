package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// LINE NUMBER BASED FILTER

// To Read Nth line of data from a file , say 5th line


// here we use BufferedReader to read data line by line.
//		---> Use readLine() to read entire line from file
// Assign Line Number
//		---> set counter variable
//		---> Use HashMap<Counter,LineRead> ie.) HashMap<Integer, String>

public class FilleReadNthLine {

	public static void main(String[] args) {
	
		String fname="C:\\Users\\Karthik\\eclipse-workspace\\JP\\src\\file\\sample.txt";
		/* Data in File
		 * ===============
		 * 
		 * Emile 12.87 22.33 
		 * Kowshik 33.99 75.10 
		 * Radha 55.98 90.32 
		 * Sam 57.98 11.03 
		 * Ishan 33.86 54.43 
		 * Imanuel 32.11 09.11 
		 * Baaji 55.33 64.11
		 * 
		 */
	
		try(BufferedReader br = new BufferedReader(new FileReader(new File(fname)));){
			String s;
			Map<Integer,String> map= new HashMap<>();
			for(int i=1;(s=br.readLine())!=null;i++) {
				map.put(i,s);
			}
			
			for(Integer i : map.keySet()) {
				if(i==5)
				System.out.println(i +")" + map.get(i));
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
