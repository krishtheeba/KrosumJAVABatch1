package NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferEx {

	public static void main(String[] args) {

		try (RandomAccessFile raf = new RandomAccessFile("C:\\Users\\Karthik\\git\\FileHandlingInJava\\JP\\src\\NIO\\data.txt","rw");) {
			
			// getting channel obj for file
			
			FileChannel fc= raf.getChannel();
			
			//create buffer with capacity of 48 bytes
			ByteBuffer buf = ByteBuffer.allocate(1);

			int bytesRead = fc.read(buf); 
			//read into buffer.
			  
			while (bytesRead != -1) {

				//limit set to currentPos and Position set to Zero
				buf.flip();
				while(buf.hasRemaining()) // if any data is there between uour current pos and limit
				{
					System.out.print((char) buf.get()); // read 1 byte at a time
				}

				buf.clear(); //make buffer ready for writing
				bytesRead = fc.read(buf);
			}
			
			
			
			
			
		} catch ( IOException e) {
			e.printStackTrace();
		}
		

	}

}
