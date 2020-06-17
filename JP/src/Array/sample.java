package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

class rocket{
	String name;
	String manfct;
	public rocket() {
		super();
	}
	public rocket(String name, String manfct) {
		super();
		this.name = name;
		this.manfct = manfct;
	}
	@Override
	public String toString() {
		return String.format("rocket [name=%s, manfct=%s]", name, manfct);
	}
	
	
	
}
public class sample {

	public static void main(String[] args) {
		
		rocket r1= new rocket();
		rocket r2= new rocket();
		rocket r3= new rocket();
		rocket r4= new rocket("www","eee");

		
		rocket r[]={r1,r1,r3,r4};
		
		List<rocket> l=Arrays.asList(r);
		
		//System.out.println(l);
		
		rocket[] r76= new rocket[2];
	//	ListIterator<rocket> li=l.listIterator();
		
		ListIterator<rocket> li= l.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println("********************************");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		
		
	//	Collections.reverse(l);
		
	//	System.out.println(l);
	
		
		
		
		
	}

}
