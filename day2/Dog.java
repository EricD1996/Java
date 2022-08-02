public class Dog {
    public String name;
    public int age;
    public String hairColor;

    // Constructor
    // __init__ in python
    public Dog() {
        this.name = "Default";
        this.age = 5;
        this.hairColor = "brown";
    }

    public Dog(String name) {
        this.name = name;
        this.age = 5;
        this.hairColor = "brown";
    }

    public Dog(String name, int age, String hairColor){
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }
}