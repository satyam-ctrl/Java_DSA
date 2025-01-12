package L1;
import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number: ");
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		if(num%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
}
