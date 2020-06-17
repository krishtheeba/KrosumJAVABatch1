package file;
//Line Based Filtering
// Reading mth row nth column field value

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadParticularField {

	public static void main(String[] args) {
		
		String fname="C:\\Users\\Karthik\\eclipse-workspace\\JP\\src\\file\\employee.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(new File(fname)));
				Scanner in= new Scanner(System.in);){
			

			
			System.out.println("ENTER ROW NUMBER");
			int n=in.nextInt();
			System.out.println("ENTER COLUMN NUMBER");
			int m=in.nextInt();
			String s;
			
			//Filtering nth Row and mth column value
			for(int i=1;(s=br.readLine())!=null;i++) {
				if(i==n) {
					if(!s.isEmpty())
					System.out.println(s.split(",")[m-1]);
					else
						System.out.println("EMPTY LINE");
				}
			}
			// Filtering specific emp salary based on emp name
			for(int i=1;(s=br.readLine())!=null;i++) {
				if(i==n) {
					System.out.println(s.split(",")[m-1]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
