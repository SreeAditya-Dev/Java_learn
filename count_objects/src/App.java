class ObjectCounter {
    static int count = 0;

   public ObjectCounter() {
      ++count;
   }
}

public class App {
   public App() {
   }

   public static void main(String[] var0) {
      ObjectCounter obj1 = new ObjectCounter();
      ObjectCounter obj2 = new ObjectCounter();
      ObjectCounter obj3 = new ObjectCounter();
      System.out.println(obj1);
      System.out.println("Number of objects created: " + ObjectCounter.count);
   }
}
