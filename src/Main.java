import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double width;
        double height;
        double area=0;

        System.out.print("Enter the width: ");
        width=scanner.nextDouble();

        System.out.print("Enter the height: ");
        height=scanner.nextDouble();
        area = width*height;

        System.out.println("The area is: "+ area +"cm²");



        scanner.close();




    }

}