import java.util.Scanner;

class EB {

    // &Attributes of the class
    int consumer_no;
    String consumer_name;
    int previous_month_reading;
    int current_month_reading;
    String connection_type;

    // & constructor
    EB(int consumer_no, String consumer_name, int previous_month_reading, int current_month_reading,
            String connection_type) {
        this.consumer_no = consumer_no;
        this.consumer_name = consumer_name;
        this.previous_month_reading = previous_month_reading;
        this.current_month_reading = current_month_reading;
        this.connection_type = connection_type.toLowerCase();
    }

    // & Method to calculate the price based on the readings and connection type
    double display() {
        double price = 0;
        if (connection_type.equals("domestic")) {
            double units = current_month_reading - previous_month_reading;
            if (units <= 100) {
                price = units;
            } else if (units >= 101 && units <= 200) {
                price = units * 2.5;
            } else if (units >= 201 && units <= 500) {
                price = units * 4;
            } else if (units >= 501) {
                price = units * 6;
            }

        } else if (connection_type.equals("commercial")) {
            double units = current_month_reading - previous_month_reading;
            if (units <= 100) {
                price = units * 2;
            } else if (units >= 101 && units <= 200) {
                price = units * 4.5;
            } else if (units >= 201 && units <= 500) {
                price = units * 6;
            } else if (units >= 501) {
                price = units * 7;
            }
        }

        return price;
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Consumer_no:");
        int consumer_no = scanner.nextInt();

        System.out.print("Enter the consumer_name:");
        String consumer_name = scanner.next();

        System.out.print("Enter the previous_month_reading:");
        int previous_month_reading = scanner.nextInt();

        System.out.print("Enter the current_month_reading:");
        int current_month_reading = scanner.nextInt();

        System.out.print("Enter the connection_type:");
        String connection_type = scanner.next();

        EB consumer = new EB(consumer_no, consumer_name, previous_month_reading, current_month_reading,
                connection_type);
        double price = consumer.display();

        System.out.println("consume_no:" + consumer_no);
        System.out.println("consume_name:" + consumer_name);
        System.out.println("price:" + price);

    }
}
