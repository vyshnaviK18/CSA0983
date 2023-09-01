
abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    void sleep() {
        System.out.println("Dog is sleeping.");
    }
}
class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("Cat is eating.");
    }

    @Override
    void sleep() {
        System.out.println("Cat is sleeping.");
    }
}

public class abstractpoly {
    public static void main(String[] args) {
        Animal dog = new Dog(); 
        Animal cat = new Cat(); 
        dog.eat();
        dog.sleep();

        cat.eat();
        cat.sleep();
    }
}
