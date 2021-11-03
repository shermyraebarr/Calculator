import java.util.*;

public class JavaCalculatorClass {
    
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("what is your first number? ");
        int num1 = scan.nextInt();

        System.out.println("what is your second number? ");
        int num2  = scan.nextInt();
        
        Add(num1, num2); {
            int sum = num1 + num2;
            System.out.println("Numbers added: " + sum);
        }
        Subtract(num1, num2); {
            int total = num1 - num2;
            System.out.println("Numbers subtracted: " + total);
        }
        Multi(num1, num2); {
            int prod = num1*num2;
            System.out.println("Product: " + prod);
        }
        Div(num1, num2); {
            int divi = num1/num2;
            System.out.println("Divided: " + divi); 
        }
        Square(num1, num2); {
            System.out.println("Squared: " + Math.pow(num1, num2));
        }
    }
    private static void Square(int num1, int num2) {

    }
    private static void Div(int num1, int num2) {

    }
    private static void Multi(int num1, int num2) {

    }
    private static void Subtract(int num1, int num2) {

    }
    private static void Add(int num1, int num2) {

    }
}
       