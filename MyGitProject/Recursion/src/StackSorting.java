import java.util.Stack;

public class StackSorting {
	
	public static void main(String arg[]) {
		Stack<Integer> st = new Stack<>();
		st.push(6);
		st.push(7);
		st.push(8);
		st.push(1);
		st.push(3);
		st.push(10);
		
		StackSorting ss = new StackSorting();
		ss.sortingStack(st);
	}

	private void sortingStack(Stack<Integer> st) {
		// TODO Auto-generated method stub
		Stack<Integer> temp = new Stack<>();
		
		while(!st.isEmpty()) {
			int value = st.pop();
			while(!temp.isEmpty() && temp.peek()>value) {
				st.push(temp.pop());
			}
			temp.push(value);
		}
	}

}
