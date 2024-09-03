package practice1.construcors;

// Define the Cat class
public class cat {
    private String name;
    private int age;

    public cat() {
        this.name = "Unknown";
        this.age = 0;
    }

    public static void main(String[] args) {
        cat myCat = new cat();
        System.out.println("Cat's Name: " + myCat.name);
        System.out.println("Cat's Age: " + myCat.age);
    }
}
