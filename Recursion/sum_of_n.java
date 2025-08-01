import java.util.Scanner;

public class sum_of_n {
    static int sum(int n) {
        if (n == 1)
            return 1;
        return n + sum(n - 1);

    }

    public static void main(String[] args) {
        System.out.print("Enter the number n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = sum(n);
        System.out.println("Enter the sum of n number: " + result);
    }
}
