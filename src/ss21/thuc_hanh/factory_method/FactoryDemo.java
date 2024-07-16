package ss21.thuc_hanh.factory_method;

public class FactoryDemo {
    public static void main(String[] args) {
        FactoryAnimal factory = new FactoryAnimal();

        Animal a1 = factory.getAnimal("feline");
        System.out.println("a1 sound : " + a1.makeSound());

        Animal a2 = factory.getAnimal("canine");
        System.out.println("a2 sound :" + a2.makeSound());
    }
}
