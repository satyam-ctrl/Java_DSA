package L3;

public class Pattern_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star=1;
		int row=1;
		int n=5;
		while(row<=2*n-1) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
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
