package basics.polymorphism;

public class Dog extends Animal
{
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }

    void eat(){
        System.out.println("Dog is eating a bone");
    }
}
