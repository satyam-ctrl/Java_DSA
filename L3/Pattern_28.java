package L3;

public class Pattern_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int space=4;
		int row=1;
		int star=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("\t");
				i++;
			}
			int j=1;
			int val=row;
			while(j<=star) {
				System.out.print(val+"\t");
				if(star/2+1>j) {
					val++;
				}else {
					val--;
				}
				j++;
			}
			row++;
			star+=2;
			space--;
			System.out.println();
		}
	}
}
