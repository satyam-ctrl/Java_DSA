package L4;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int n=3;
		for(int i=0;i<n;i++) {
			System.out.print(a+" ");
			int c = a+b;
			a=b;
			b=c;
		}
		System.out.println(a);
	}
}
 