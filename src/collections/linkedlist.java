package collections;
import java.util.LinkedList;
import java.util.ListIterator;
public class linkedlist {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args)
	   {
	         
	       LinkedList ll = new LinkedList();
	       
	         
	       ll.add("A");
	       ll.add("B");
	       ll.add("C");
	       ll.add("D");
	       
	       System.out.println(ll);
	       
	          
	       ll.add(4, "A");
	       ll.add(5, "A");
	       
	       System.out.println(ll);
	       
	          
	      ll.remove("A");     
	       ll.remove("B");      
	       
	       System.out.println(ll);
	       

	       ListIterator iterator = ll.listIterator();

	       while (iterator.hasNext()) {
	           System.out.println(iterator.next());
	       }
	   }
}
