package factory.abstractfactory;

public class bananaFactory implements FruitFactory {
    public MyBeverages createBeverages() {
        return new bananaBeverages();
    }
    public MyCompote createCompote() {
        return new bananaCompote();
    }
}
