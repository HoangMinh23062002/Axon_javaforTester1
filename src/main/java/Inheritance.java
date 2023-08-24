class Inheritance {
    public void eat() {
        System.out.println("I can eat");
    }
}

class Dog extends Inheritance {
    public void bark() {
        System.out.println("I can bark");
    }
}

class Main {
    public static void main(String[] args) {
        Dog labrador = new Dog();
        labrador.eat();
        labrador.bark();
    }
}
