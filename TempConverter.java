import java.util.*;
public class TempConverter {
    public static double celsiusToFahrenheit(double celsius){
        return(celsius*9/5)+32;
}

public static double fahrenheitToCelsius(double fahrenheit){
    return(fahrenheit-32)*5/9;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Temperature Converter");
         System.out.println("Choose any one 1 or 2 for conversion:");
          System.out.println("1. Celsius to Fehrenheit");
           System.out.println("2. Fahrenheit to Celsius");

           int choice = sc.nextInt();

            switch(choice){
            case 1:
            System.out.println("Enter Temperature in Celsius:");
            double celsius = sc.nextDouble();
            double fahrenheitResult = celsiusToFahrenheit(celsius);
            System.out.printf("%.2f °C = %.2f°F\n", celsius, fahrenheitResult);
            System.out.println("*Temperature converted to fahrenheit*");
            break;

            case 2:
            System.out.println("Enter Temperature in Fahrenheit:");
            double fahrenheit = sc.nextDouble();
            double celsiusResult = fahrenheitToCelsius(fahrenheit);
            System.out.printf("%.2f °F = %.2f°C\n", fahrenheit, celsiusResult);
            System.out.println("*Temperature converted to celsius*");
            break;

            default:
            System.out.println("Invalid choice!");
          }
     }
}

