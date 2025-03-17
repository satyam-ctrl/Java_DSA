package L4;

public class Pascal_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int row=0;
		int star=1;
		while(row<=n-1) {
			int i=0;
			int ncr=1;
			while(i<star) {
				System.out.print(ncr+"\t");
				ncr= ((row-i)*ncr)/(i+1);
				i++;
			}
			row++;
			star++;
			System.out.println();
		}
	}
}
