package factory.abstractfactory;

public class appleFactory implements FruitFactory{
    public MyBeverages createBeverages() {

        return new appleBeverages();
    }
    public MyCompote createCompote() {
        return new appleCompote();
    }
}
