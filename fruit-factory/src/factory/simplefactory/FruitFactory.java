package factory.simplefactory;

import factory.MyFruit;

public class FruitFactory {
//    public MyFruit create(String name){
////        if("Iapple".equals(name)){
////            return new Iapple();
////        }else{
////            return null;
////        }
//
//    }
//    public MyFruit create(String className){
//        try {
//            if(!(null==className||"".equals(className))){
//                return (MyFruit)Class.forName(className).newInstance();
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return null;
//    }

    public MyFruit create(Class clazz){
        try {
            if(clazz!=null){
                return (MyFruit)clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
