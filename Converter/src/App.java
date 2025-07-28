import java.util.Scanner;



import converter.CurrencyConverter;
import converter.DistanceConverter;
import converter.TimeConverter;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the option:\n1.Currency\n2.Distance\n3.Time");
        System.out.print("Enter the choice: ");
        int mainChoice = scanner.nextInt();

        switch (mainChoice) {
            case 1:
                System.out.println("Currency Converter:\n1.Dollar to INR\n2.Euro to INR\n3.Yen to INR\n4.INR to Dollar\n5.INR to Euro\n6.INR to Yen");
                System.out.print("Enter the choice: ");
                int cChoice = scanner.nextInt();
                System.out.print("Enter the amount: ");
                double cAmount = scanner.nextDouble();
                double cResult = 0;
                switch (cChoice) {
                    case 1: cResult = CurrencyConverter.dollarToInr(cAmount); break;
                    case 2: cResult = CurrencyConverter.euroToInr(cAmount); break;
                    case 3: cResult = CurrencyConverter.yenToInr(cAmount); break;
                    case 4: cResult = CurrencyConverter.inrToDollar(cAmount); break;
                    case 5: cResult = CurrencyConverter.inrToEuro(cAmount); break;
                    case 6: cResult = CurrencyConverter.inrToYen(cAmount); break;
                    default: System.out.println("Invalid choice"); return;
                }
                System.out.println("Result: " + cResult);
                break;
            case 2:
                System.out.println("Distance Converter:\n1.Meter to KM\n2.Miles to KM\n3.KM to Meter\n4.KM to Miles");
                System.out.print("Enter the choice: ");
                int dChoice = scanner.nextInt();
                System.out.print("Enter the value: ");
                double dValue = scanner.nextDouble();
                double dResult = 0;
                switch (dChoice) {
                    case 1: dResult = DistanceConverter.meterToKm(dValue); break;
                    case 2: dResult = DistanceConverter.milesToKm(dValue); break;
                    case 3: dResult = DistanceConverter.kmToMeter(dValue); break;
                    case 4: dResult = DistanceConverter.kmToMiles(dValue); break;
                    default: System.out.println("Invalid choice"); return;
                }
                System.out.println("Result: " + dResult);
                break;
            case 3:
                System.out.println("Time Converter:\n1.Hour to Minutes\n2.Hour to Seconds\n3.Minutes to Hours\n4.Seconds to Hours");
                System.out.print("Enter the choice: ");
                int tChoice = scanner.nextInt();
                System.out.print("Enter the value: ");
                double tValue = scanner.nextDouble();
                double tResult = 0;
                switch (tChoice) {
                    case 1: tResult = TimeConverter.hourToMinutes(tValue); break;
                    case 2: tResult = TimeConverter.hourToSeconds(tValue); break;
                    case 3: tResult = TimeConverter.minutesToHours(tValue); break;
                    case 4: tResult = TimeConverter.secondsToHours(tValue); break;
                    default: System.out.println("Invalid choice"); return;
                }
                System.out.println("Result: " + tResult);
                break;
            default:
                System.out.println("Invalid main choice");
        }
        scanner.close();
    }
}
