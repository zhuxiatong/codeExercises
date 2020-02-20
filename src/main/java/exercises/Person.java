package exercises;

public class Person {
    static int num;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public Person(String name) {
        this.name = name;
        this.num++;
    }


}
