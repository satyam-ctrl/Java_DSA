package L4;
import java.util.*;
public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int count = 0;
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				count++;
				break;
			}
		}
		if(count==1) {
			System.out.println("Not Prime");
		}else {
			System.out.println("Prime Number");
		}
	}
}
