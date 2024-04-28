package org.example.Project;

public class AnimalTest {
    public static void main(String[] args) {

        Animal[] animal= {new Mammal(),new Bird("Bob",12),new Parrot("pim",10),new Eagle("jim",12),new Elephant()};
          for(Animal a:animal){
              a.eat();
              a.sleep();
              a.makeSound();
              a.makeSound();
          }



    }
}
