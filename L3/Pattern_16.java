package L3;

public class Pattern_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int space=4;
		int star=1;
		int row=1;
		while(row<=2*n-1) {
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
			if(row<n) {
				space--;
			}else {
				space++;
			}
			if(row<n) {
				star++;
			}else {
				star--;
			}
			row++;
			System.out.println();
		}
	}
}
