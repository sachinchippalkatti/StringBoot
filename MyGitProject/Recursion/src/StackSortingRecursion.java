import java.util.Stack;

public class StackSortingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(6);
		st.push(7);
		st.push(8);
		st.push(1);
		st.push(3);
		st.push(10);
		
		StackSortingRecursion ss = new StackSortingRecursion();
		ss.sortStack(st);
	}

	private void sortStack(Stack<Integer> st) {
		// TODO Auto-generated method stub
		if(!st.isEmpty()) {
			int value = st.pop();
			sortStack(st);
			insertAtBottom(st,value);
		}
	}

	private void insertAtBottom(Stack<Integer> st, int value) {
		// TODO Auto-generated method stub
		if(st.isEmpty() || st.peek()<value) {
			st.push(value);
			return;
		}
			int temp = st.pop();
			insertAtBottom(st, value);
			st.push(temp);
	}

}
