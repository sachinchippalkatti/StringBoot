
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorialOfNumber(5));
		System.out.println(sumOfConsigitive(4));
	}

	private static int sumOfConsigitive(int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return 1;
		else
			return n+sumOfConsigitive(n-1);
	}

	private static int factorialOfNumber(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return 1;
		else
			return n*factorialOfNumber(n-1);
	}

}
