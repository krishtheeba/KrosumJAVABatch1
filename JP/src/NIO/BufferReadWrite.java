package NIO;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BufferReadWrite {
	public static void main(String[] args) throws IOException {
		String fName= "C:\\Users\\Karthik\\git\\FileHandlingInJava\\JP\\src\\NIO\\data.txt";
		
		write(fName);
		read(fName);
		
	}

	private static void write(String fName) throws IOException {
		try(RandomAccessFile raf = new RandomAccessFile(fName,"rw");){
		
		raf.seek(raf.length());
		String input = "Anil,2234,Prod2,Delhi";
		byte[] inputBytes = input.getBytes();
		ByteBuffer byteBuffer = ByteBuffer.wrap(inputBytes);
		FileChannel channelWrite = raf.getChannel();
		channelWrite.write(byteBuffer);
		channelWrite.close();}
	}

	private static void read(String fName) throws IOException {
		try(RandomAccessFile raf = new RandomAccessFile(fName,"rw");){
		FileChannel channelRead = raf.getChannel();
		ByteBuffer byteBuffer = ByteBuffer.allocate(512);
		channelRead.read(byteBuffer);
		byte[] byteArray = byteBuffer.array();
		String fileContent = new String(byteArray).trim();
		System.out.println("File Content: " + fileContent);
		channelRead.close();}
	}
}