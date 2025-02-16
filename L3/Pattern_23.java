package L3;

public class Pattern_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int space=4;
		int num=1;
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=num) {
				System.out.print("1 ");
				j++;
			}
			row++;
			num+=2;
			space--;
			System.out.println();
		}
	}

}
