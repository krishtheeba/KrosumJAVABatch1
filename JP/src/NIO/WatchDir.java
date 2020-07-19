package NIO;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

public class WatchDir {

public static void main(String[] args) {


Path myDir = Paths.get("D:\\Theeba__Java");		//An object implementing the Watchable interface
												//		- the Path class is perfect.


try {
	// A WatchServeice object - watcher who watch some watchable 
	WatchService watcher = myDir.getFileSystem().newWatchService();   

	// Watchable is registered with a WatchService with set of events
	myDir.register(watcher, StandardWatchEventKinds.ENTRY_CREATE,
			StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);

	
	// when event is detected, key is signalled and is retrieved by poll() or take() method.
	// Once event is processed, invoke key's reset() method that allows key to be signalled and requeued again.
	WatchKey watchKey = watcher.take();

	while(true) {
		List<WatchEvent<?>> events = watchKey.pollEvents();
		for (WatchEvent event : events) {
			if (event.kind() == StandardWatchEventKinds.ENTRY_CREATE) 	
				System.out.println("Created: " + event.context().toString());
		
			if (event.kind() == StandardWatchEventKinds.ENTRY_DELETE) 
				System.out.println("Delete: " + event.context().toString());
		
			if (event.kind() == StandardWatchEventKinds.ENTRY_MODIFY) 
				System.out.println("Modify: " + event.context().toString());
		
		}watchKey.reset();
	}

	} catch (Exception e) {
		e.printStackTrace();}
	}
}
