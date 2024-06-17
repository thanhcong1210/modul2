package ss7.ThucHanh.Lop_Animal_va_interface_Edible;

import ss7.ThucHanh.Lop_Animal_va_interface_Edible.animal.Animal;
import ss7.ThucHanh.Lop_Animal_va_interface_Edible.animal.Chicken;
import ss7.ThucHanh.Lop_Animal_va_interface_Edible.animal.Tiger;
import ss7.ThucHanh.Lop_Animal_va_interface_Edible.fruit.Fruit;
import ss7.ThucHanh.Lop_Animal_va_interface_Edible.fruit.Apple;
import ss7.ThucHanh.Lop_Animal_va_interface_Edible.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Chicken chicken = (Chicken) animal;
                System.out.println(chicken.howToEat());
            }

        }
        Fruit [] fruit = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();
        for (Fruit f : fruit) {
            System.out.println(f.howToEat());
        }

    }
}