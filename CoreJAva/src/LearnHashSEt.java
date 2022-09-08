import java.util.HashSet;
import java.util.Set;

public class LearnHashSEt
{

	public static void main(String[] args)
	{
		// set now allow duplicate element
		Set<Integer> set = new HashSet<Integer>();
		//LinkedHashSet for to maintain order of elmt
		//TreeSet for to get sorted output

		set.add(2);
		set.add(2);
		set.add(5);
		set.add(4);
		set.add(3);
		System.out.println(set);
		set.remove(2);
		System.out.println(set.contains(3));

	}

}
