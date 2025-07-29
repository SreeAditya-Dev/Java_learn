import java.util.Scanner;

public class if_else {
    public static void main(String[] argv){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the age:");
        int age = scanner.nextInt();

        if(age>=18){
            System.out.println("You can vote...........");
        }
        else if(age<18){
            System.out.println("You cannot vote...");
        }
    }
}
