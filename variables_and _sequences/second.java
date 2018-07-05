import java.util.Scanner;

class Second {
	public static void main(String[] args) {
		String firstName;
		String lastName;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		firstName = scanner.nextLine();
		
		System.out.println("Enter your last name: ");
		lastName = scanner.nextLine();
		
		System.out.println(lastName + ", " + firstName);
	}
}
