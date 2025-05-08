abstract class Animal {

    abstract void makeSound();

    void eat(){
        System.out.println(" Animal is eating ");
    }

}

class Dog extends Animal{

    @Override
    void makeSound() {
        System.out.println(" Dog sounds Bark");
    }

}

class Cat extends Animal{

    @Override
    void makeSound() {
        System.out.println(" Cat sounds Meowww ");
    }
}

class main{
    public static void main (String [] args ){
        Cat c = new Cat();
        c.eat();
        c.makeSound();



        Dog d = new Dog();
        d.eat();
        d.makeSound();

    }
}