interface Color{
    String getColor();
}

class Red implements Color{
    @Override
    public String getColor() {
        return "Red";
    }

}

class Blue implements Color{
    @Override
    public String getColor() {
        return "Blue";
    }
}

class Green implements Color{
    @Override
    public String getColor() {
        return "Green";
    }
}

abstract class Shape{

    String type;
    Color color;
    public Shape(){}
    public Shape(String type, Color color)
    {
        this.color = color;
        this.type = type;
    }
}

class Square1 extends Shape{

    private float length;
    private float breadth;

    public Square1(Color color, float length, float breadth)
    {
        super("Square",color);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public String toString() {
        return "Square1{" +
                "type='" + type + '\'' +
                ", color=" + color.getColor() +
                ", length=" + length +
                ", breadth=" + breadth +
                '}';
    }
}

class Circle1 extends Shape{

    private float radius;

    public Circle1(Color color, float radius){
        super("Circle", color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle1{" +
                "type='" + type + '\'' +
                ", color=" + color.getColor() +
                ", radius=" + radius +
                '}';
    }
}


public class Question_5 {

    public static void main(String[] args) {
        Square1 square1 = new Square1(new Red(),5.5f, 6.5f);
        System.out.println(square1);
        Circle1 circle1 = new Circle1(new Green(),55.2f);
        System.out.println(circle1);

    }

}
