package ss7.ThucHanh.Lop_Animal_va_interface_Edible.animal;

import ss7.ThucHanh.Lop_Animal_va_interface_Edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Chicken: cluck - cluck!";
    }
    @Override
    public String howToEat(){
        return "Chicken could be fried  ";
    }
}
