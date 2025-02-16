package L3;

public class Pattern_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int space1 = 0;
		int space2 = 3;
		int row = 1;
		while (row <= n) {
			int i = 1;
			while (i <= space1) {
				System.out.print("  ");
				i++;
			}
			System.out.print("* ");
			int j = 1;
			while (j <= space2) {
				System.out.print("  ");
				j++;
			}
			if (row != 3) {
				System.out.print("* ");
			}
			if (row <= n / 2) {
				space1++;
				space2 -= 2;
			} else {
				space1--;
				space2 += 2;
			}
			row++;
			System.out.println();
		}

	}
}
