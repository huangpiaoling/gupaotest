package factory.factorymethod;

import factory.Iapple;
import factory.MyFruit;

public class IappleFactory implements MyFruitFactory {
    public MyFruit create(){
        return  new Iapple();
    }
}
