package enumAndIterator;

import java.util.*;

public class TestDriver {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(Arrays.asList(args));
		Enumeration<String> enumeration = v.elements();

		Iterator<?> iterator = new EnumerationIterator(enumeration);
		System.out.println("\nEnumeration Like a Iterator");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\n\n---------------------------\n");
		
		ArrayList<String> l = new ArrayList<String>(Arrays.asList(args));
		Enumeration<?> enmueartion2 = new IteratorEnumeration(l.iterator());
		System.out.println("Iterator Like a Enumeration");
		while(enmueartion2.hasMoreElements()) {
			System.out.println(enmueartion2.nextElement());
		}
		
	}
}
