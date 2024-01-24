interface Shape{
    void draw();
}
class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside square class:: draw");
    }
}

class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside rectangle class:: draw");
    }
}


class ShapeFatory{
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        ShapeFatory shapeFatory = new ShapeFatory();
        Shape square = shapeFatory.getShape("square");
        Shape rectangle = shapeFatory.getShape("rectangle");

        square.draw();
        rectangle.draw();
    }
}