
import java.util.Scanner;

public class Calculator2 {
       
        double number1;
        double number2;

    void plus(double number1, double number2){
        double result = number1 + number2;
        System.out.println(number1 +" + "+ number2 +" = " + result);
    }

    void minus(double number1, double number2){
        double result = number1 - number2;
        System.out.println(number1 +" - "+ number2 +" = " + result);
    }

    void multiply(double number1, double number2){
        double result = number1 * number2;
        System.out.println(number1 +" * "+ number2 +" = " + result);
    }

    void divide(double number1, double number2){
        double result = number1 / number2;
        System.out.println(number1 +" / "+ number2 +" = " + result);
    }
}


class CalculatorDemo {
     public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Calculator2 calcu = new Calculator2();
        System.out.println("What do you want Number");
        System.out.println("1. + numner");
        System.out.println("2. - number");
        System.out.println("3. * number");
        System.out.println("4. / number");
        System.out.print("Enter here:");
        keyboard.close();
        
        int calculate = keyboard.nextInt();

        System.out.println("Enter your 1st number : ");
        calcu.number1 = keyboard.nextDouble();
        System.out.println("Enter your 2nd number : ");
        calcu.number2 = keyboard.nextDouble();

        if(calculate == 1){
            calcu.plus(calcu.number1, calcu.number2);
        }
        if(calculate ==2){
            calcu.minus(calcu.number1, calcu.number2);
        }
        if(calculate ==3){
            calcu.multiply(calcu.number1, calcu.number2);
        }
        if(calculate ==4){
            calcu.divide(calcu.number1, calcu.number2);
        }
     }
    
}

