package Design_Patterns.Factory;

import Design_Patterns.Abstract_Factory.AbstractFactory;

public  class ShapeFactory extends AbstractFactory {
    @Override
    public  Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("TRIANGLE")){
            return new Triangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
