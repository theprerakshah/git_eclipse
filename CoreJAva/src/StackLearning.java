import java.util.Stack;

public class StackLearning
{

	//	static void showpush(Stack st,int a) {
	//		st.push(new Integer(a));
	//		System.out.println("push(" + a + ")");
	//		System.out.println("stack: " + st);
	//	}
	//	static void showpop(Stack st) {
	//		int a = (int) st.pop();
	//		System.out.println(a);
	//		System.out.println("stack:" + st);
	//	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		System.out.println("Stack\n" + st);
		//		showpush(st,32);
		//		showpush(st,32);
		//		showpush(st,32);
		//		showpush(st,32);
		//		showpop(st);
		//		showpop(st);
		//		showpop(st);
		//		showpop(st);
		st.push(23);
		st.push(43);
		st.push(43);
		System.out.println(st.pop());
		System.out.println("Stack\n" + st);
		//		int[] arr1 = {1,32,4,5,768,565,9,2};
		//		Arrays.sort(arr1);
		//		for(int i : arr1) {
		//			System.out.println(i);
		//		}
	}

}
