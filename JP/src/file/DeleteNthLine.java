package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class DeleteNthLine {

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
		Map<Integer,String> map= new HashMap<>(); String s;
		try (BufferedReader br = new BufferedReader(new FileReader(new File(fname)))) {
			
			// LINE BASED READING AND PLACING IN MAP
			for(int i=1;(s=br.readLine())!=null;i++) {
				map.put(i,s);
			}
			
			// IGNORING NTH LINE AND PRINTING OTHER LINES, say 5th Line
			for(Integer i : map.keySet()) {
				if(i==5)
					continue;
				else ;
				//	System.out.println(i +")" + map.get(i));
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(fname)))) {
			
			map.remove(5, map.get(5));
			// DELETING NTH LINE, Say 5th Line
			
			map.values().forEach(x->
					{System.out.println(x);
						if(x.matches("^\\s.[0-9]"))
							x.replaceAll("^[0-9].[)]",x.substring(3));
						System.out.println("replaced : " + x);
					});
			bw.write(map.toString().replace("{"," ").replace("=", ")").replace(",","\n").replace("}", " "));
				
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
