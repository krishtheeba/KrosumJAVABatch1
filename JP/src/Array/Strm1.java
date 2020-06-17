package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// To print names that does not start with "A"
public class Strm1 {

	public static void main(String[] args) {
	
		List<String> list = Arrays.asList("Alice","Barath","Sam","Usha");
		
		//System.out.println(filter(list));
		
		//List<String> res= list.stream().filter(el->el.startsWith("A")).collect(Collectors.toList());
		
		List<Boolean> res1= list.stream().map(el->el.startsWith("A")).collect(Collectors.toList());
		System.out.println(res1);


		
		
	}

	
	static List<String> filter(List<String> s){
		
		List<String> res= new ArrayList<>();
		for(String el : s)if(!el.startsWith("A")) res.add(el);
	
		return res;
	}
}
