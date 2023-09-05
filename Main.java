import java.util.Scanner ;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you'd like a factorial number of:");
        int n = scanner.nextInt();  // Change n to calculate factorial of a different number
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " is " + factorial);
    }
}
