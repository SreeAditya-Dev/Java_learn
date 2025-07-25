import java.util.Scanner;

public class input_while_loop {
    public static void main(String[] argv){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Num value:");
        int num = scanner.nextInt();
        int k = 1;
        while (k<num) {
            System.out.println(k);
            k++;
            
        }
    }
}
