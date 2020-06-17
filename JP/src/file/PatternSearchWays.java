package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Possibilities to search a pattern from file.
// 
//		1. Matcher. matches()
//							---> Pattern and Matcher class from java.util.regex 
//							---> We Create Pattern Object and user Pattern.compile(regx)
//								 to set the pattern.
//							---> Use Pattern.matcher(Input) to pass input.
//							---> Create Matcher object and call Matcher.matches() method
//								 to test whether input matching with pattern or not.		
//		2. String.matches()
//							---> Use Str.matches(regx) from String class to test whether
//								 input matching with pattern or not.
//-----------------------------------------------------------------------------------------
// In performance point Of View , while dealing with large files where a particular pattern has to
// be checked, using Matcher.matches() works best because the pattern has been assigned before 
// through Pattern.compile(regx) which runs only once.
// Whereas using String.matches(regx) assigns the pattern every time a line is read.
// In case of large file this makes the performance difference.
public class PatternSearchWays {

	public static void main(String[] args) {
		
		String fname="C:\\Users\\Karthik\\eclipse-workspace\\JP\\src\\file\\employee.csv";
		String line, emp;
		long start, end;
		Scanner in= new Scanner(System.in);	
		try(BufferedReader br = new BufferedReader(new FileReader(new File(fname)))){
			
			System.out.println("ENTER EMP NAME");
			emp= in.next();
			System.out.println("WAY 1: USING PATTERN OBJECT AND MATCHER.MATCHES()");
						
			Pattern pattern = Pattern.compile("(?i).*"+emp+".*");
			Matcher match ;
			
			start = System.currentTimeMillis();
			for(int i=1;(line=br.readLine())!=null;i++) {
				match =pattern.matcher(line);
				if(match.matches()) 
					System.out.println("At line number: " + i+ " : " +line);
				else 
					continue;
			}end= System.currentTimeMillis();
			System.out.println("TIME TAKEN : " + (end-start) + " millisecs.");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(new File(fname)))){
		
			System.out.println("ENTER EMP NAME");
			emp= in.next();
			
			System.out.println("WAY 2: USING STRING.MATCHES()");
			
			start = System.currentTimeMillis();
			
			for(int i=1;(line=br.readLine())!=null;i++) 
				if(line.matches("(?i).*"+emp+".*")) 
					System.out.println("At line number: " + i+ " : " +line);
				else 
					continue;
			end= System.currentTimeMillis();
			System.out.println("TIME TAKEN : " + (end-start) + " millisecs.");	
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		in.close();
	}

}
