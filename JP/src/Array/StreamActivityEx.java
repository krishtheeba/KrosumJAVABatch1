package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamActivityEx {

	public static void main(String[] args) {
	

		// 1.To get last element of stream
		
		Stream<Integer> s = Arrays.asList(new Integer[] {1,2,3,4,5}).stream();
		
		
		Stream<Integer> emptyStream = Stream.empty(); 
		 
		Integer lastElement = emptyStream.reduce((first, second) -> second)
		                                .orElse(-1);
		 
		System.out.println(lastElement);    //-1
		 
		//or
		 
		Stream<Integer> emptyStream1 = Stream.empty(); 
		 
	//	Integer lastElement1 = emptyStream1.reduce((first, second) -> second)
//		                .orElseThrow(() -> new IllegalStateException("no last element"));
		
		
		
		
		//Find or remove duplicates from List
		
		ArrayList<Integer> numbersList 
		    = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
		  
		List<Integer> listWithoutDuplicates = numbersList.stream()
		            .distinct()
		            .collect(Collectors.toList());
		  
		System.out.println(listWithoutDuplicates);
		
		
		
		// joining Streams of strings
		
        Stream<String> words = Arrays.asList("A", "B", "C", "D").stream();
        
        String joinedString = words.collect(Collectors.joining());      //ABCD
         
        System.out.println( joinedString ); 
 
        joinedString = words.collect(Collectors.joining(","));  // streams can't be reused. comment other options when executing    //A,B,C,D
         
        System.out.println( joinedString );
 
        joinedString = words.collect(Collectors.joining(",", "{", "}"));    //{A,B,C,D}
         
        System.out.println( joinedString );
        
        
        // merge two streams
        
        Stream<Integer> firstStream = Stream.of(1, 2, 3);
        Stream<Integer> secondStream = Stream.of(4, 5, 6);
         
        Stream<Integer> resultingStream = Stream.concat(firstStream, secondStream);
         
        System.out.println( resultingStream.collect(Collectors.toList()) );
        
        
        // merging multiple streams
        
        Stream<Integer> first = Stream.of(1, 2);
        Stream<Integer> second = Stream.of(3,4);
        Stream<Integer> third = Stream.of(5, 6);
        Stream<Integer> fourth = Stream.of(7,8);
         
        Stream<Integer> resultingStream1 = Stream.concat(first, Stream.concat(second, Stream.concat(third, fourth)));
         
        System.out.println( resultingStream1.collect(Collectors.toList()) );
   
        
        
        //Merge streams and retain unique elements
        
        Stream<Integer> firstSt = Stream.of(1, 2, 3, 4, 5, 6);
        Stream<Integer> secondSt = Stream.of(4, 5, 6, 7, 8, 9);
 
        Stream<Integer> resultingSt = Stream.concat(firstSt, secondSt)
                                                .distinct();
 
        System.out.println( resultingSt.collect(Collectors.toList()) );
    
        
        
        //count the number of elements in stream, use Stream.count() 
        
        long count = Stream.of("how","to","do","in","java").count();
        System.out.printf("There are %d elements in the stream %n", count);
         
        count = IntStream.of(1,2,3,4,5,6,7,8,9).count();
        System.out.printf("There are %d elements in the stream %n", count);
         
        count = LongStream.of(1,2,3,4,5,6,7,8,9).filter(i -> i%2 == 0).count();
        System.out.printf("There are %d elements in the stream %n", count);
        
       
        
        // To count the number of elements in stream, use Collectors.counting()
        
        
        long count1 = Stream.of("how","to","do","in","java").collect(Collectors.counting());
        System.out.printf("There are %d elements in the stream %n", count);
         
        count1 = Stream.of(1,2,3,4,5,6,7,8,9).collect(Collectors.counting());
        System.out.printf("There are %d elements in the stream %n", count);
         
        count1 = Stream.of(1,2,3,4,5,6,7,8,9).filter(i -> i%2 == 0).collect(Collectors.counting());
        System.out.printf("There are %d elements in the stream %n", count);
    
	}

}
