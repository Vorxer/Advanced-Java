package misc;

public class Person {

    String name;

    int age;

    long number;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", number=" + number +
                '}';
    }

    public Person(String name, int age, long number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }
}
