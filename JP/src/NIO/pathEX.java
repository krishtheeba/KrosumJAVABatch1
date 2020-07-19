package NIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class pathEX {

	public static void main(String[] args) throws IOException {
	
//		//  FileSystems.getDefault() creates an object that provides an access to file system accessible by jvm
//		
//		Path path = FileSystems.getDefault().getPath("C:\\Users\\Karthik\\git\\FileHandlingInJava\\JP\\src\\NIO\\data.txt");
//		System.out.println( " object that access file system : "+ FileSystems.getDefault());
//		System.out.println(System.getProperty("user.home"));
//		System.out.println(System.getProperty("user.dir"));
//			
//		BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
//		
//		System.out.println(reader.readLine());
//		
//		
//		
//		//*********************************************************
//		
//		Path path1= Paths.get(args[0]);
//		System.out.println(path1);
//		
//		Path path2= Paths.get(URI.create("file:///Karthik/"));
//		System.out.println(path2);
//		System.out.println( );
		
		
	System.out.println(FileSystems.getDefault().getPath("").toAbsolutePath().toString());	
		Path pathObject = Paths.get("C:\\Users\\Karthik\\Desktop\\..\\KROSUM\\Workshop");
		System.out.println(pathObject.getFileName());
		System.out.println(pathObject.getName(0));
		System.out.println(pathObject.getNameCount());
		System.out.println(pathObject.getParent());
		System.out.println(pathObject.getFileSystem());
		System.out.println(pathObject.getRoot());
		System.out.println(pathObject.subpath(0, 2);
		
		System.out.println(pathObject.normalize());
		
	}

}
