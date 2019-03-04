interface Shapes{
    void createShapes();
}

class Square implements Shapes{

    @Override
    public void createShapes() {
        System.out.println("Square Is Created");
    }
}

class Triangle implements Shapes{
    @Override
    public void createShapes() {
        System.out.println("Triangle is Created");
    }
}

class Pentagon implements Shapes{

    @Override
    public void createShapes() {
        System.out.println("Pentagon is created");
    }
}


class Polygon{
    Shapes shapes;

    public Shapes getShapes() {
        return shapes;
    }

    public void setShapes(Shapes shapes) {
        this.shapes = shapes;
    }
}


class PolygonFactory{

    static Polygon getPolygonObject(String shape){
        Polygon polygon = new Polygon();
        switch (shape){
            case "Square":
                polygon.setShapes(new Square());
                break;
            case "Triangle":
                polygon.setShapes(new Triangle());
                break;
            case "Pentagon" :
                polygon.setShapes(new Pentagon());
                break;
        }

        return polygon;
    }
}


public class Question_2 {

    public static void main(String[] args) {

        Polygon createOneSquare = PolygonFactory.getPolygonObject("Square");

        createOneSquare.getShapes().createShapes();

        Polygon createOneTriangle = PolygonFactory.getPolygonObject("Triangle");

        createOneTriangle.getShapes().createShapes();

        Polygon createOnePentagon = PolygonFactory.getPolygonObject("Pentagon");

        createOnePentagon.getShapes().createShapes();

    }

}
