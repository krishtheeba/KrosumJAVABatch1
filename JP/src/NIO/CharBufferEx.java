package NIO;

import java.nio.CharBuffer;
import java.util.Arrays;

public class CharBufferEx {

	public static void main(String[] args) {
		CharBuffer cb = null;
		try {
			
		cb=CharBuffer.allocate(20);
		cb.put(0,'a');
		cb.put("he",0,1);
	//	cb.put("Hel",2,5);
	//	cb.put("hai".toCharArray());
		
		cb.rewind();
		System.out.println(Arrays.toString(cb.array()));
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Overflow. resizing Buffer : " );
			cb=doubleTheBufferSize(cb);
			
		}finally {
			System.out.println(Arrays.toString(cb.array()));
		}
	}

	private static CharBuffer doubleTheBufferSize(CharBuffer cb) {
			CharBuffer newBuffer = CharBuffer.wrap(Arrays.copyOf(cb.array(),cb.capacity()*2));
			return newBuffer;
			
			
		}
		
		
	}


