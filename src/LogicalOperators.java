import java.util.Scanner;

public class LogicalOperators {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*double temp=20;
        boolean isSunny=false;

        if (temp<=30&&temp>=0&&isSunny){
            System.out.println("The weather is Good!");
            System.out.println("IT is Sunny Outside!");
        }
        else if (temp<=30&&temp>=0&&!isSunny) {
            System.out.println("The Weather is Good");
            System.out.println("It is Cloudy outside");
        }
        else if (temp>30||temp<0) {
            System.out.println("The Weather is Not Good Today!");

        }


        String username;

        System.out.print("Enter your Username:");
        username=scanner.nextLine();

        if (username.length()<4||username.length()>20){
            System.out.println("Username must contain 4-12 Characters!");
        }
        else if (username.contains(" ")||username.contains("_"))
            {
                System.out.println("Username Must not contain spaces or Underscore!");

            }
        else {
            System.out.println("Welcome: " + username);
        }


        String name="";

        while(name.isEmpty()){
            System.out.print("Enter your name:");
            name=scanner.nextLine();
        }
        System.out.println("HEllO " + name);
        scanner.close();


        int age=0;

        System.out.print("Enter your age:");
        age=scanner.nextInt();

        while(age<0){
            System.out.println("Your age can't be negative:");
            System.out.print("Enter your age:");
            age=scanner.nextInt();
        }
        System.out.println("You are " + age + "Year's old");

         */
        int number;

        do {
            System.out.print("Enter a number: ");
            number=scanner.nextInt();
        }
        while (number<1||number>10);
        System.out.println("You picked " + number);



    }
}
