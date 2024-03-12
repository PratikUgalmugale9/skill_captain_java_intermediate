public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Create Person objects
        Person alice = new Person("Alice", 25);
        Person bob = new Person("Bob", 30);

        // Print out name and age properties of each Person object
        System.out.println("Person 1:");
        System.out.println("Name: " + alice.getName());
        System.out.println("Age: " + alice.getAge());
        System.out.println();

        System.out.println("Person 2:");
        System.out.println("Name: " + bob.getName());
        System.out.println("Age: " + bob.getAge());
    }
}
