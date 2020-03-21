import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> st = new Stack<>();
		st.push(6);
		st.push(7);
		st.push(8);
		st.push(1);
		st.push(3);
		st.push(10);
		
		ReverseStack ss = new ReverseStack();
		ss.reverse(st);
	}

	private void reverse(Stack<Integer> st) {
		// TODO Auto-generated method stub
		if(!st.isEmpty()) {
			int value = st.pop();
			reverse(st);
			insertAtBottom(st,value);
		}
	}

	private void insertAtBottom(Stack<Integer> st, int value) {
		// TODO Auto-generated method stub
		if(st.isEmpty()) {
			st.push(value);
			return;
		}
		
		int temp = st.pop();
		insertAtBottom(st, value);
		st.push(temp);
	}

}
