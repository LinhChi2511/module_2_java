package ss7_abstractClass;

import ss7_abstractClass.animal.Animal;
import ss7_abstractClass.animal.Chicken;
import ss7_abstractClass.animal.Tiger;
import ss7_abstractClass.edible.Edible;
import ss7_abstractClass.fruit.Apple;
import ss7_abstractClass.fruit.Fruit;
import ss7_abstractClass.fruit.Orange;


public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }

    }
}
