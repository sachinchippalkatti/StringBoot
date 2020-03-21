
public class fibonachi {

	public static int F[] = new int[51];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonachi(6));
		for(int i =0 ;i<51 ; i++) {
			F[i] = -1;
		}
		F[0] = 0;
		F[1] = 1;
		System.out.println(fibonacciUsingMemorization(40));
	}

	private static int fibonacciUsingMemorization(int n) {
		// TODO Auto-generated method stub
		/*if(n<=1) 
			return n;*/
		if(F[n] != -1)
			return F[n];
		
		
			F[n] = fibonacciUsingMemorization(n-1) + fibonacciUsingMemorization(n-2);
			return F[n];
	}

	private static int fibonachi(int n) {
		// TODO Auto-generated method stub
		if(n<=1)
			return n;
		else
			return fibonachi(n-1) + fibonachi(n-2);
	}

}
