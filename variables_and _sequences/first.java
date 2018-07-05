import java.util.Scanner;

class First {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first operator: ");

        int op1 = scanner.nextInt();

        System.out.println("Enter the second operator: ");
        int op2 = scanner.nextInt();

        System.out.println(op1 + " / " + op2 + " = " + calculator(op1, op2));
    }

    static int calculator (int op1, int op2) {
        return op1 / op2;
    }
}
