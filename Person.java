public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void printPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);

        person.printPersonInfo();
    }
}

