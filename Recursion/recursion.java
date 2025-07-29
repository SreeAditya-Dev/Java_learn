import java.util.Scanner;

public class recursion {

    static int rec(int num){
        if (num < 1) {
            return 1;
        } else {
            System.out.println(num);
            int result = rec(num/2);
            System.out.println(num);
            return result;
        }
    }
    public static void main(String[] argv){
        System.out.println("Recursion......");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number:");
        int num = scanner.nextInt();

        int result = rec(num);
        System.out.println("this is the result:"+result);

    }
}
