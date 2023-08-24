package homework;

class Thuake {
  // Lớp cha
    String name;
    public void eat() {
        System.out.println("I can eat");
    }
}


class Dogs extends Thuake {
 // Lớp con kế thừa lớp cha
    public void display() {
        System.out.println("My name is " + name );
    }
}

class Main {
    public static void main(String[] args) {

        Dogs labrador = new Dogs();
        // tạo 1 đối tượng cho Dogs và gán biến
        labrador.name = "Rohu";
        labrador.display();
        // Gọi phương thức
        labrador.eat();
    }
}
