package L2;

public class Package_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int star = 1;
		int row=1;
		int space=4;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				if(j%2==0) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
				j++;
			}
			star+=2;
			space--;
			row++;
			System.out.println();
		}
	}

}
