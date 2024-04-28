package org.example.Project;

public class Animal implements AnimalBehavior {

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void makeSound() {

    }
}
    class Mammal extends Animal {

        @Override
        public void eat (){
            System.out.println("Mammal dont eat");
        }

        @Override
        public void sleep(){
            System.out.println("Mammal sleep 9 hours");
        }
        @Override
        public  void makeSound(){
            System.out.println("myyyy");
        }

    }

    class Bird extends Animal{


        @Override
        public void eat() {
            System.out.println("Bird  eat fish");
        }
        @Override
        public void sleep() {
            System.out.println("Bird sleep 6 hours");
        }
        @Override
        public void makeSound() {
            System.out.println("sing");

        }
        Bird(String name, int age){
            System.out.println(name+" "+age);
        }
    }



    class Lion extends Mammal{

        @Override
        public void eat() {
            System.out.println("Lion  eat meat");
        }
        @Override
        public void sleep() {
            System.out.println("Lion sleep 10 hours");
        }
        @Override
        public void makeSound() {
            System.out.println("RRRRRR");
        }

    }



class Elephant extends Mammal {


    @Override
    public void eat() {
        System.out.println("Elephant  eat fruits");
    }

    @Override
    public void sleep() {
        System.out.println("Elephant sleep 12 hours");
    }

    @Override
    public void makeSound() {
        System.out.println("igaaaaaa");
    }
}

class Parrot extends Bird{

    Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Parrot  eat fruits");
    }

    @Override
    public void sleep() {
        System.out.println("Parrot sleep 12 hours");
    }

    @Override
    public void makeSound() {
        System.out.println("chik chirik");
    }
}
class Eagle extends Bird {
    Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Eagle  eat meat");
    }

    @Override
    public void sleep() {
        System.out.println("Eagle sleep 3 hours");
    }

    @Override
    public void makeSound() {
        System.out.println("pi pi pi ");
    }
}
