import java.util.Scanner;
public class print_sum {
    public static void main (String[] argv){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the A value:");
        int a = scanner.nextInt();
        System.out.print("Enter the B value:");
        int b = scanner.nextInt();
        

        System.out.print("Sum of A+B:"+(a+b));
    }
}
