import java.util.Scanner;

public class Practice5subsStrings {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//
//        String email;
//        String username;
//        String domain;
//
//        System.out.print("Enter your email:");
//        email=scanner.nextLine();
//
//        if (email.contains("@")){
//            username=email.substring(0,email.indexOf("@"));
//            domain=email.substring(email.indexOf("@")+1);
//            System.out.println(username);
//            System.out.println(domain);
//        }
//        else {
//            System.out.println("Email must Contain @");
//        }
        double weight;
        double newWeight;
        int choice;
        System.out.println("**************************");
        System.out.println("Weight Conversion Program:");
        System.out.println("**************************");

        System.out.println("1:Convert Weight to kgs:");
        System.out.println("2:Convert Weight to lbs:");
        System.out.println("");

        System.out.print("Choose an option:");
        choice=scanner.nextInt();

        if (choice==1){
            System.out.print("Enter the Weight in lbs: ");
            weight=scanner.nextDouble();
            newWeight=weight*0.453592;
            System.out.printf("The New Weight in kgs is %.2f\n",newWeight);

        }
        else if (choice==2) {
            System.out.print("Enter the Weight in kgs: ");
            weight=scanner.nextDouble();
            newWeight=weight*2.20462;
            System.out.printf("The New Weight in lbs is %.2f\n",newWeight);

        }
        else {
            System.out.println("Please Enter a Valid Option 🤓");
        }

        scanner.close();


    }
}
