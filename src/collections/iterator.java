package collections;
import java.util.ArrayList;
import java.util.Arrays;
public class iterator {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args)
	{
ArrayList digits = new ArrayList(Arrays.asList(1,2,3,4,5,6));

	java.util.Iterator iterator = digits.iterator();

	while(iterator.hasNext()) {
	   System.out.println(iterator.next());
	}
	}
}

	
