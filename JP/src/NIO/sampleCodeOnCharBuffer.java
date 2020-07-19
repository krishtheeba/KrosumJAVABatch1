package NIO;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.Arrays;

public class sampleCodeOnCharBuffer {

	public static void main(String[] args) {
		
		ByteBuffer bb = ByteBuffer.allocate(100);
		byte[] byteArray = {1,2,3,4};
		//ByteBuffer bb= ByteBuffer.wrap(byteArray);
		bb.put(byteArray);
		byte c;bb.rewind();
		while(bb.hasRemaining())if((c=bb.get())!=0)System.out.println(c);
		System.out.println(bb.capacity()+"\n");
		bb.rewind();

		CharBuffer cb = bb.asCharBuffer();
		System.out.println(cb.capacity()+"\n");
	//	byte b=1;
	//	cb.put((char)(b & 0xff));
		
		cb.put("hi");
		cb.rewind();
	//	bb.rewind();
	System.out.println(Arrays.toString(bb.array()));
		System.out.println(cb);
		
		

	}
	
	private static CharBuffer doubleTheBufferSize(CharBuffer cb) {
		CharBuffer newBuffer = CharBuffer.wrap(Arrays.copyOf(cb.array(),cb.capacity()*2));
		return newBuffer;
		
		
	}
}
