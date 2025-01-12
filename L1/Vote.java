package L1;
import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter your age: ");
		Scanner kb = new Scanner(System.in);
		int age = kb.nextInt();
		if(age>=18) {
			System.out.println("You are eligible to vote");
		}else {
			System.out.println("Not Eligible to vote");
		}
	}
}
