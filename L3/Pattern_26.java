package L3;

public class Pattern_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int star = 1;
		int row = 1;
		int space = 4;
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}
			int val = 1;
			int j = 1;
			while (j <= star) {
				System.out.print(val + "\t");
				j++;
				val++;
			}
			row++;
			space--;
			star += 2;
			System.out.println();
		}
	}

}
