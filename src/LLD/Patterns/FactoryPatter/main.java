package LLD.Patterns.FactoryPatter;

public class main {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shapeObj = shapeFactory.getShape("CIRCLE");
        shapeObj.draw();

        Shape shapeObj1 = shapeFactory.getShape("RECTANGLE");
        shapeObj1.draw();

        Shape shapeObj2 = shapeFactory.getShape("SQUARE");
        shapeObj2.draw();
    }
}
