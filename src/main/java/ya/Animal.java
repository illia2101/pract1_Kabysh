package ya;

public class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(name + " eats.");
    }
    public String toString() {
        return "Animal{name = '" + name + "'}";
    }

}