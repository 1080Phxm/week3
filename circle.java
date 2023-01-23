import java.util.Scanner;

public class circle {
    double redius;

    double findarea(){
        return 3.1416 * (redius * redius);
    }
    double findperimeter() {
        return 2 * 3.1416 * redius ;
   }

    
}

class CircleDemo {

    public static void main(String[] args) {
        circle myCircle = new circle();
        System.out.print("plese insert circle redius: ");

        Scanner keyborad = new Scanner(System.in);
        myCircle.redius = keyborad.nextDouble();
        keyborad.close();

        System.out.println("Area of circle = " + myCircle.findarea());
        System.out.println("perimeter of circle = "+ myCircle.findperimeter());
        
    }
}