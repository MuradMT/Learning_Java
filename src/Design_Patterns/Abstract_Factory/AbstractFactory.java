package Design_Patterns.Abstract_Factory;

import Design_Patterns.Factory.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
}
