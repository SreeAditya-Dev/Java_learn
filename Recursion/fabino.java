import java.util.Scanner;

public class fabino {
    static int fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args){
        System.out.print("Enter the number n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            int result = fib(i);
            System.out.print(result + " ");
        }
    }
}
