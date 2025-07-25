import java.util.Scanner;

public class Star1 {
    public static void main(String[] argv){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        System.out.println("...............Start pattern..............");
        for(int i=1;i<=a;i++){
            System.out.println("*".repeat(i));
        }
        
        for(int j=a;j>=1;j--){
            System.out.println("*".repeat(j));
        }
    }
    
}
