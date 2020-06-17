package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FileReadandWrite {

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
		
		String s;
		List<String> list = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(new File(fname)))){

			while((s=br.readLine())!=null) {
				list.add(s);
			}	
			System.out.println(list.toString().replace("["," ").replace(",","\n").replace("]]", " "));
			System.out.println();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File(fname)))){
			// Read 5th Line and Write to 2th Line
			
			s=list.get(4);list.remove(4);
			list.add(3,s);
			

		

//			bw.write(list.toString().replace("["," ").replace(",","\n").replace("]]", " "));
//			System.out.println(list.toString().replace("["," ").replace(",","\n").replace("]]", " "));
			Stream nos = Stream.of(IntStream.iterate(1, i->i+1).boxed().collect(Collectors.toList()));
			bw.write(Stream.concat(list.stream(),nos).collect(Collectors.toList()));
			list.stream().forEachOrdered(x->{
				try {
					bw.write(x+"\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
