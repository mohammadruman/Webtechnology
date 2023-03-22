// 1. Illustrate the usage of abstract class with following Java classes –
// i>An abstract class “Student‟ with data member roll no, reg no and a abstract method course()
// ii>A subclass “Kiitian” with course() method implementation

class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cat is meowing");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
       Animal animal;
       Dog D= new Dog();
       Cat C= new Cat();
       animal = D;
       animal.makeSound();
       animal = C;
       animal.makeSound();
    }
}
