package practise;
import java.util.*;

public class StackDemo1 {
	public static void main(String[]args) {
		//created a stack
		Stack<Integer> s = new Stack<Integer>();
		//inserting elements into stack
		s.push(2);
		s.push(9);
		s.push(5);
		System.out.println(s);
		//performed delete operation on stack
		//s.pop();
		System.out.println(s);
		//s.pop();
		//System.out.println(s);
		
		//peek operation
		//System.out.println(s.peek());
		//System.out.println(s.isEmpty());
		
		int indexfound=s.search(4);
		System.out.println(indexfound);
		//how to iterate over stack
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Integer I=(Integer)itr.next();
			System.out.println(I);
		}
		System.out.println(s.size());
		s.sort(null);
		System.out.println(s);
	}

}
