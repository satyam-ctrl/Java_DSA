package L2;

public class Pattern_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int space=0;
		int star=n;
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			row++;
			star--;
			space+=2;
			System.out.println();
		}
	}

}
