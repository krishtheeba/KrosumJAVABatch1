package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamex1 {

	public static ArrayList<Integer> square(List<Integer> list) {
		
		ArrayList<Integer> l= new ArrayList<>();
		
		ListIterator<Integer> li= list.listIterator();
		
		int x,y;
		
		while(li.hasNext()) {
			
			x=li.next();
			
			y=x*x;
			
			l.add(y);
		
			
		}
		return l;
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<>();System.out.println("***********without stream - squaring elmts**************");
		list=Arrays.asList(new Integer[] {1,2,3,4,5,2,3,4});
		
		for(Integer i: square(list))System.out.println(i);
		
		System.out.println("**********with stream - squaring elmts***************");
		List<Integer> listOutput =list.stream().map(x->x*x).collect(Collectors.toList());
		
			
		for(Integer x : listOutput)System.out.println(x);

		System.out.println("**********with stream - remove duplicate***************");
		
		Stream<Integer> lis= list.stream().distinct();
		
		lis.forEach(x->System.out.println(x));
		
		

	}

}
