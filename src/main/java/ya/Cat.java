package ya;

public class Cat extends Animal {
    public String breed;
    public Cat(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    public String toString(){
        return "Cat{" + super.toString() + " , breed = " + breed + "}";
    }
}