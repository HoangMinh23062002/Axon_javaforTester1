abstract class Abtraction {
    abstract void draw();
}

class Circles extends Abtraction {
    void draw() {
        System.out.println("Drawing Circle...");
    }
}

class Rectangle extends Abtraction {
    void draw() {
        System.out.println("Drawing Rectangle...");
    }
}

class main {
    public static void main(String[] args) {
        Circles c1 = new Circles();
        c1.draw();

        Rectangle r1 = new Rectangle();
        r1.draw();
    }
}
