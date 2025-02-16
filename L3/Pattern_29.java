package L3;

public class Pattern_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int space=4;
		int star=1;
		int val=1;
		while(row<=2*n-1) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			int p=val;
			while(j<=star) {
				System.out.print(p+" ");
				if(j<star/2+1) {
					p++;
				}else {
					p--;
				}
				j++;
			}
			if(row<n) {
				star+=2;
				space--;
				val++;
			}else {
				star-=2;
				space++;
				val--;
			}
			
			row++;
			System.out.println();
		}
	}
}
