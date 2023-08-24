class Polymorphism {
    public void render() {
        System.out.println("Hinh bán nguyệt...");
    }
}

class Square extends Polymorphism {
    public void render() {
        System.out.println("Rendering hình vuông...");
    }
}

class Circle extends Polymorphism {
    public void render() {
        System.out.println("Rendering tròn...");
    }
}

class Mainn {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.render();

        Circle c1 = new Circle();
        c1.render();
    }
}
