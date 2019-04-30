package factory.simplefactory;
import factory.Iapple;
import factory.MyFruit;

public class SimpleFactoryTest {
    public static void main(String[] args) {
//        MyFruit fruit = new Iapple();
//        fruit.beverages();

//        FruitFactory factory = new FruitFactory();
//        MyFruit fruit = factory.create("Iapple");
//        fruit.beverages();

        FruitFactory factory = new FruitFactory();
        MyFruit fruit = factory.create(Iapple.class);
        fruit.beverages();
    }
}
