import java.util.Scanner;

public class input_for_loop {
   public input_for_loop() {
   }

   public static void main(String[] var0) {
      System.out.println("Enter the Number:");
      Scanner var2 = new Scanner(System.in);
      int var1 = var2.nextInt();

      for(int var3 = 0; var3 < var1; ++var3) {
         System.out.println(var3);
      }

   }
}
