package Oefening.Liang9_1;

public class Rectangle {
    private double height =1 ;
    private double width =1;
          
    public Rectangle (double width, double height)
    {
        setWidth(width);
        setHeight(height);
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return (height * 2) + (width * 2);
    }
}
