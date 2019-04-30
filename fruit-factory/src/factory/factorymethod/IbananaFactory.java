package factory.factorymethod;

import factory.Ibanana;
import factory.MyFruit;

public class IbananaFactory implements MyFruitFactory {
    public MyFruit create() {
        return new Ibanana();
    }
}
