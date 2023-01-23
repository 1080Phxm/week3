public class Rectangle {

    //fields - object's -attribbute
    double length;
    double width;

    double findarea() {
        return length * width;
   }

    


}

class RectangleDemo {

     public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println("rectangle1 length = " + rectangle1.length);
        System.out.println("rectangle1 width = " + rectangle1.width);
        System.out.println("area of rectangle1 =  "+ rectangle1.findarea());
        System.out.println("area of rectangle1 =  " + rectangle1.findarea());

        rectangle1.length = 10;
        rectangle1.width = 5;

        System.out.println("rectangle1 length = " + rectangle1.length);
        System.out.println("rectangle1 width = " + rectangle1.width);
        System.out.println("area of rectangle1 =  " + rectangle1.findarea());
        System.out.println("area of rectangle1 =  " + rectangle1.findarea());



    }

}
