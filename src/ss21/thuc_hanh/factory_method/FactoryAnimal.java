package ss21.thuc_hanh.factory_method;

public class FactoryAnimal {
    public Animal getAnimal(String type){
        if ("canine".equals(type)){
            return new Dog();
        }else {
            return new Cat();
        }
    }
}