package L3;

public class Pattern_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int star = 5;
		int space = 0;
		int row = 1;
		while (row <= 2 * n - 1) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			if (row < n) {
				star--;
				space += 2;
			} else {
				star++;
				space -= 2;
			}
			System.out.println();
			row++;

		}
	}
}
