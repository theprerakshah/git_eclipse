import java.util.*;
public class CollectionFramework {

	public static void main(String[] args) {
	List<String> student= new ArrayList();	
	student.add("Yagnesh ");
	student.add("Pancholi ");
	student.add("Heyyyy ");// n -> n+n/2 +1
	System.out.println(student);
	System.out.println("\n\n");
	student.add(1, "good morning");
	System.out.println(student);
	System.out.println("\n\n");
	
	List<String> list = new ArrayList();
	list.add("good");
	list.add(" morning");
	student.addAll(list);
	
	System.out.println(student);
	System.out.println("\n\n");
	
	System.out.println(list.get(1));
	System.out.println("\n\n");
	list.remove(0);
	list.remove(0);
	
	student.remove(String.valueOf("Yagnesh"));
	System.out.println(list);
	System.out.println("\n\n");	
	
	System.out.println(student);
	System.out.println("\n\n");	
	//list.set(index, element)
	//contains
	
	}

}
