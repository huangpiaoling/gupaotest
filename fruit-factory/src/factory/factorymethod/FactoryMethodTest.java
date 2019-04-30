package factory.factorymethod;

import factory.MyFruit;

public class FactoryMethodTest {
    public static void main(String[] args) {
        MyFruitFactory factory = new IappleFactory();
        MyFruit fruit = factory.create();
        fruit.beverages();

        factory = new IbananaFactory();
        fruit = factory.create();
        fruit.beverages();
    }
}
