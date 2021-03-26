package Spring_21;
import java.util.Scanner;

public class calculator {
    
    // addition //
    public static double addNum( double n1, double n2 ) {
        double total = n1 + n2;
        return total;
    }

    // subtraction //
    public static double subNum(double n1, double n2){
        double total = n1 - n2;
        return total;
    }

    // multiply two num
    public static double mutiNum( double n1, double n2) {
        double total = n1 * n2;
        return total;
    }
    // division //
    public static double divNum( double n1, double n2){
        double total = n1 / n2;
        return total;
    }

    public static void main( String[]args) {

        //take input from users
        Scanner scan = new Scanner( System.in );

        System.out.print("Enter Number1: ");
        double num1 = scan.nextDouble();

        System.out.print("Enter Number2: ");
        double num2 = scan.nextDouble();

        //double num1 = 24.0;
        //double num2 = 13.0;
        //addition
        double sm = addNum( num1, num2 );
        System.out.print( " addition: " + sm );
        //subtraction
        double sub = subNum(num1, num2);
        System.out.print(" subtraction: " + sub);
        //multiplication
        double multi = mutiNum( num1, num2 );
        System.out.print(" multiplication: "+ multi);
        //division
        double div = divNum(num1, num2);
        System.out.print(" division: " + div);

    }
}
