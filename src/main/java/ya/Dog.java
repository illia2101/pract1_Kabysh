package ya;

public class Dog extends Animal {
    private String breed;
    public Dog(String name, String breed){
        super(name);
        this.breed = breed;
    }
    public void eat() {
        System.out.println(name + " eats dog food.");
    }
    public void bark() {
        System.out.println(name + " barks: woof!");
    }

    public String toString(){
        return "Dog{" + super.toString() + " , breed = " + breed + "}";
    }

}