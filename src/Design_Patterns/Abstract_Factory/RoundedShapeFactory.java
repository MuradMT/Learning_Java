package Design_Patterns.Abstract_Factory;

import Design_Patterns.Factory.Circle;
import Design_Patterns.Factory.Shape;
import Design_Patterns.Factory.Square;
import Design_Patterns.Factory.Triangle;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("ROUNDEDSQUARE")){
            return new RoundedSquare();

        }

        return null;
    }
}
