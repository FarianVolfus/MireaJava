

public class pract32 {
    public static void main(String[] args) {
        Circle c1 = new Circle(10, "Blue", true );
        Rectengular r1 = new Rectengular(13.4 , 41, "blue" , true );
        System.out.println(c1);
        System.out.println(r1);
    }

}

abstract class Shape{
    protected String color;
    protected boolean filled;

    public Shape(){}

    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +  "color = '" + color + "'" + " filled = "+ filled + '}';
    }
}

class Circle extends Shape{
    protected double radius;

    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }
    public double getPerimtr(){
        return 2 * this.radius * Math.PI;
    }

    public String toString() {
        return "Circle{" + "radius= " + radius + '}';
    }
}
class Rectengular extends Shape{
    protected double width;
    protected double length;

    public Rectengular(){}

    public Rectengular(double width, double length){
        this.length = length;
        this.width = width;
    }
    public Rectengular(double width, double length, String color, boolean filled){
        this.length = length;
        this.width = width;
        this.color = color;
        this.filled = filled;
    }
    //сеторы и гетары
    public double getWidth() {
        return this.width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return this.length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){ return (length * width) / 2; }
    public double getPerimetr(){return Math.pow(width,3);}

    @Override
    public String toString() {
        return "Rectengular{" +  "width = " + width +  ", length = " + length + " , filled = " + filled + " , color = " + color +  "}";
    }
}



class Square extends Rectengular{

    public Square(){}
    public Square(double side){}
    public Square(double side, String color, boolean filled){}
    public void setSide(){
        this.width = width;
    }
    public double getSide(){
        return width;
    }
    public void setLength(){ this.length = length;}

    @Override
    public String toString() {
        return "Square{" + "width=" + width + " , lenngth = " + length + " , color =" + color +  "}";
    }
}


