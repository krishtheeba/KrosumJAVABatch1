package NIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ComparisonIONIO {

	public static void main(String[] args) {
		
		try(BufferedReader br= new BufferedReader(new FileReader("C:\\Users\\Karthik\\git\\FileHandlingInJava\\JP\\src\\NIO\\data.txt"))){
			
			String line1 = br.readLine();
			String line2 = br.readLine();
			String line3 = br.readLine();
			
			System.out.println("Line1 :" + line1);
			System.out.println("Line2 :" + line2);
			System.out.println("Line3 :" + line3);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try (RandomAccessFile raf = new RandomAccessFile("C:\\Users\\Karthik\\git\\FileHandlingInJava\\JP\\src\\NIO\\data.txt","r");) {
				
				// getting channel obj for file
				
				FileChannel fc= raf.getChannel();
				
				//create buffer with capacity of 48 bytes
				ByteBuffer buf = ByteBuffer.allocate(72);
				
				
				int dataRead = fc.read(buf);
				
				
				
				byte byteArray[] =buf.array();
				
				String line = new String(byteArray);
				
				System.out.println(line);
			//	buf.rewind();
				double d= 12.789;byte b= (byte)d;
				System.out.println(b);
				//System.out.println(buf.getDouble());
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
