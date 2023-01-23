import java.util.Scanner;
public class Calculator {
    double number1;
    double number2;

    public static void plus(double number1,double number2){
        double result = number1 + number2;
        System.out.println("Result = "+result);
    }
    public static void minus(double number1,double number2){
        double result = number1 - number2;
        System.out.println("Result = "+result);
    }
    public static void maltiple(double number1,double number2){
        double result = number1 * number2;
        System.out.println("Result = "+result);
    }
    public static void div(double number1,double number2){
        double result = number1 / number2;
        System.out.println("Result = "+result);
    }
class CalculatorDemo{
    public static void main(String[] args){
        Scanner keyborad = new Scanner(System.in);
        System.out.println("Press 1 = +");
        System.out.println("Press 2 = -");
        System.out.println("Press 3 = *");
        System.out.println("Press 4 = /");
        int number = keyborad.nextInt();
        System.out.print("plese insert number1:");
        double number1 = keyborad.nextDouble();
        System.out.print("plese insert number2:");
        double number2 = keyborad.nextDouble();
        keyborad.close();
        if(number==1)
        {
            plus(number1,number2);
        }
        else if(number==2)
        {
            minus(number1,number2);
        }
        else if(number==3){
            maltiple(number1,number2);
        }
        else if(number==4)
        {
            div(number1,number2);
        }
        else{
            System.out.print("Error");
        }

       



}
}
}
