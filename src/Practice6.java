public class Practice6 {
    public static void main(String[] args) {

        /*
        ternary operator = Return 1 or 2 values if a condition is true
        variable = (condition)? if true: iffalse;
                int score=5;
                String PassorFail = (score>=60)? "Pass":"Fail";
                System.out.println(PassorFail);

        int number = 100;
        String EvenorOdd = (number%2==0)? "Even":"Odd";
        System.out.println(EvenorOdd);


        int hours = 13;
        String daytime = (hours>12)? "A.M":"P.M";
        System.out.println(daytime);

         */
        int income = 600000;
        double taxrate = (income>=40000)? 0.25:0.15;
        System.out.println(taxrate);

    }
}
