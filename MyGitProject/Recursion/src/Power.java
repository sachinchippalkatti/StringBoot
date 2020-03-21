
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(powerOfNumber(2,4));
		System.out.println(modulerExponcial(5,3,7));
	}

	private static int modulerExponcial(int x, int n, int m) {
		// TODO Auto-generated method stub
		if(n==0)
			return 1;
		else if(n%2==0) {
			int y = modulerExponcial(x, n/2, m);
			return (y*y)%m;
		}else
			return ((x%m)*(modulerExponcial(x, n-1, m)%m))%m;
				
	}

	private static int powerOfNumber(int x, int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return 1;
		else if(n%2==0) {
			int y = powerOfNumber(x, n/2);
			return y*y;
		}
		else 
			return x*powerOfNumber(x, n-1);
	}

}
