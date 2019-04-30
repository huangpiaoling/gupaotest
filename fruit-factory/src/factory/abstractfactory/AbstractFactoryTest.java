package factory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        appleFactory factory = new appleFactory();
        factory.createBeverages().drink();
        factory.createCompote().eat();
    }
}
