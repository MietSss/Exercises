package Oefening.Liang9_1;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4,10);
        Rectangle rect2 = new Rectangle(3.5,35.9);


        double perimeterRect1 = rect1.getPerimeter();
        System.out.printf("Perimeter of Rectangle 1 is %.2f m %n", perimeterRect1);
        double perimeterRect2 = rect2.getPerimeter();
        System.out.printf("Perimeter of Rectangle 2 is %.2f m" +
                " %n", perimeterRect2);

        double areaRect1 = rect1.getArea();
        System.out.printf("The are of Rectangle 1 is %.2fm^2 %n", areaRect1);
        double areaRect2 = rect2.getArea();
        System.out.printf("The are of Rectangle 2 is %.2fm^2 %n", areaRect2);


    }
}
