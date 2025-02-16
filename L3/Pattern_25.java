package L3;

public class Pattern_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int space = 4;
		int star = 1;
		int row = 1;
		int val=1;
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}
			int j = 1;
			while (j <= star) {
				System.out.print(val+"\t");
				val++;
				j++;
			}
			space--;
			star += 2;
			row++;
			System.out.println();
		}

	}

}
