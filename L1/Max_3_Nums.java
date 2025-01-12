package L1;

import java.util.*;

public class Max_3_Nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
		if (a >= b && a >= c) {
			System.out.println(a);
		} else if (b >= a && b >= c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}
}
