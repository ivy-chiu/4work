import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		System.out.println("Enter number of rows: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int space = num;

		for (int i = 1; i <= num; i++) {
			for (int s = 1; s < space; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			space--;
		}
		for (int i = num - 1; i >= 1; i--) {
			for (int s = 0; s <= space; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			space++;
			System.out.println();
		}
	}
	
	//test
} 