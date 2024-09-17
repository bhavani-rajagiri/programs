package Polymorphism;

class Parent {
    void display() {
        System.out.println("Display method of Parent");
    }
}
class Child extends Parent {
    void display() {
        System.out.println("Display method of Child");
    }
    void print() {
    	System.out.println("Child Method, not present is parent calss");
    }
}
public class Upcasting {

	public static void main(String[] args) {
        Parent parent = new Child();
        parent.display(); // This will call the display method of Child
       // parent.print();// cant access the child method which is not part of parent class with up-casting this can be achieved with "down-casting" 
    }
}

