import java.util.Scanner;
public class Practice {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
//
//       double width;
//       double height;
//       double area;
//
//       System.out.print("Enter the width: ");
//       width=scanner.nextDouble();
//
//       System.out.print("Enter th height:");
//       height=scanner.nextDouble();
//
//       area=width*height;
//
//       System.out.println("The area of rectangle is: "+ area + "cm²");
       String adjective1;
       String noun1;
       String adjective2;
       String verb1;
       String adjective3;

       System.out.print("Enter an adjective:");
       adjective1=scanner.nextLine();

       System.out.print("Enter an Noun:");
       noun1=scanner.nextLine();

       System.out.print("enter an adjective: ");
       adjective2=scanner.nextLine();

       System.out.print("Enter an Verb: ");
       verb1=scanner.nextLine();

       System.out.print("Enter an adjective: ");
       adjective3=scanner.nextLine();

       System.out.println("Today I went to a " + adjective1 + " zoo ");
       System.out.println("In an exhibit,I saw a " + noun1 +".");
       System.out.println(noun1 + " was " + adjective2 + " and " + verb1);
       System.out.println("I was " + adjective3 + "!");

       scanner.close();



    }

}
