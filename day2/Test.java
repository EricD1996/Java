public class Test {
    public static void main(String[] args){
        System.out.println("Hello there");
        
        //instantiating an object
        //creating an instance of the class
        Dog dog1 = new Dog("Bentley", 5, "Brown");
        Dog dog2 = new Dog("Kenji", 7, "Brown");
        Dog dog3 = new Dog();
        // dog1.name = "Bentley";
        System.out.println(dog1.name);
        System.out.println(dog1.age);
        System.out.println(dog1.hairColor);
        System.out.println(dog2.name);
        System.out.println(dog2.age);
        System.out.println(dog2.hairColor);
    }
}