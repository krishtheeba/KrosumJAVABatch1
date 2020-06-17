package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class dataRead {

	public static void main(String[] args) {
		
		String fname="C:\\Users\\Karthik\\eclipse-workspace\\JP\\src\\file\\sample.txt";
		double value[][]= new double[5][2];
		String names[]= new String [5];
		
//		try {
//			Scanner in= new Scanner(new File(fname));
//			for(int i=0;i<value.length;i++) {
//				
//				if(in.hasNextDouble()) {
//					value[i][0]=in.nextDouble();
//					value[i][1]= in.nextDouble();
//				}else
//					names[i]=in.next();
//			}
//			for(int i=0;i<value.length;i++) {
//				System.out.println(names[i]);
//				for(int j=0;j<2;j++) {
//					System.out.println(value[i][j]);
//				}
//			}
//			//System.out.println(Arrays.toString(value));
//			
//			//System.out.println(Arrays.stream(value).map(a-> String.join(" ", a)).collect(Collectors.joining(", ")));
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
	
		try {
			Scanner in = new Scanner(new File(fname));
			
//			for (int i = 0; i < names.length; i++) {
//		        StringBuffer sbr = new StringBuffer();
//
//		        while (in.hasNext("[a-zA-Z]+")) {
//		            sbr.append(in.next() + " ");
//		        }
//		        names[i] = sbr.toString().trim();
//
//		        if (in.hasNextDouble()) {
//		            value[1][i] = in.nextDouble();
//		            value[2][i] = in.nextDouble();
//		        }
//		    }
//			System.out.println(Arrays.toString(names));
			
			
			for(int i=0;i<names.length;i++) {
				StringBuilder sb= new StringBuilder();
				while(in.hasNext("[a-zA-Z]+")) {
					names[i]=in.next();
					
					//sb.append(in.next()+ " ");
				}
				while(in.hasNextDouble()) {
					value[i][0]=in.nextDouble();
					value[i][1]=in.nextDouble();
				}
				//System.out.println(sb.toString());
			}
			String sam[][]={{"ishan","theam"},{"poga","hansi"}};
			System.out.println(Arrays.toString(names));	// 1D String Array
			System.out.println(Arrays.deepToString(value)); 
			System.out.println(Arrays.deepToString(value).replace("],","]\n").replace(","," ").replace("[[","[").replace("]]", "]")); 
			
		Arrays.stream(value).forEach(System.out::println);
			Arrays.stream(sam).
			map(a->String.join(" ",a))
			.forEach(System.out::println);
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		}
		

	}

}
