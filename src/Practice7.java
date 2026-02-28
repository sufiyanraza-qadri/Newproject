import java.util.Scanner;
public class Practice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newtemp;
        String unit;

        System.out.print("Enter the Temperature: ");
        temp=scanner.nextDouble();

        System.out.println("Enter the Weight Conversion (Celcius(C) or Farenheit(F)?: ");
        unit=scanner.next().toUpperCase();

        newtemp = (unit.equals("C"))? (temp-32)*5/9: (temp*9/5)+32;

        System.out.printf("%.1fº%s",newtemp,unit);



    }
}
