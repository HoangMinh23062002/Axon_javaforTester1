public class Oop extends Abstrac {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Oop(String name, int age){
        this.age=age;
        this.name=name;

    }

    @Override
    void makeSound() {
        System.out.println("Running");
    }
}
