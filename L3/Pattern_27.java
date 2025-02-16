package L3;

public class Pattern_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int space = 4;
		int star = 1;

		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}
			int j = 1;
			int val = 1;
			while (j <= star) {
				System.out.print(val + "\t");
				if (j < star / 2 + 1) {
					val++;
				} else {
					val--;
				}
				j++;
			}
			row++;
			star += 2;
			space--;
			System.out.println();
		}
	}

}
