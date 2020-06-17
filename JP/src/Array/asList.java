package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class asList {

	public static void main(String[] args) {
	
		try {
			
			String Hosts[]= {"host1.krosum.com", "host2.krosum.com", "host3.krosum.com", "host4.krosum.com"};
			
			//List---> ArrayList, Vector, Stack, LinkedList
			
			
			List< String> list  = new ArrayList<>(); //O(n)
			
			
			/*
			 * ArrayList<>()---> 10
			 * ArrayList<>(Collection)
			 * ArrayList<>(capacity)---->
			 * 
			 * ensureCapacity( grow-----------------> (oldca *3/2)+1---> 16, 25
			 * 
			 */
			
			list.add("192.123.1.2");
			
			list.add("192.123.1.2");
			System.out.println(list);
			
			List iml= Arrays.asList(Hosts); // fixed array 
			
			System.out.println(iml);
			
		
			
			System.out.println(iml); 
			
			Hosts[0]="jgjdnm";
			
			System.out.println(iml); 		
			
			List ml= new ArrayList(Arrays.asList(Hosts));//copy
			
			Hosts[1]="1214354";
			
			System.out.println(ml);
			
			iml.remove(2);
			
			
			System.out.println(iml);
			
			// O(1)
			
			
		}
		catch(Exception e) { e.printStackTrace();}
		
		
		//factory method  ----asList()--->


	}

}
