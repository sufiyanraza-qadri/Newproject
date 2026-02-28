import java.util.Scanner;

public class Practive8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean ValidOperation;

        System.out.print("Enter the value for num1:");
        num1 = scanner.nextDouble();

        System.out.print("Enter an Operator:(+,-,*,/,^):");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the value for num2:");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result=num1*num2;
            case '/'-> {
                if (num2 == 0) {
                    System.out.println("Can't divide by zero");
                    ValidOperation = false;
                }
                else {
                    result = num1 / num2;
                }
            }
            case'^'-> result= Math.pow(num1,num2);
            default -> {
                System.out.println("Invalid Operation");
                ValidOperation=false;

            }
            

        }
        System.out.println(result);
        scanner.close();
    }
}


              /*  System.out.print("Enter the Day of the Week:");
        String day = scanner.next().toLowerCase();

        switch(day){
            case "monday","tuesday","wednesday","thursday","friday"
                    -> System.out.println("It's a Weekday🥸");
            case "saturday","sunday"-> System.out.println("It's a Weekend🥳!!");
            default -> System.out.println(day+ " is not a day🤓");
        }

       */


















