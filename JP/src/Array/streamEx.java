package Array;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamEx {

	public static void main(String[] args) {
	
		int intArray[]= {1,2,3,4,5};
		
	//	char charArray[]= {'a','c','f','g'};
		
	//	Arrays.stream(charArray);
		
		IntStream intStream= Arrays.stream(intArray);
		
		Stream<int[]> strObj= Stream.of(intArray);
		
		intStream.forEach(x ->System.out.println(x));
		
		IntStream intObj= strObj.flatMapToInt(Arrays::stream);
		
		//strObj.forEach(x->System.out.println(x));
		
		System.out.println();
		
		intObj.forEach(x->System.out.println(x));
		
		
		
		
		
		
	}

}
