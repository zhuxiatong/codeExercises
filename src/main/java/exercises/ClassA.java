package exercises;

public class ClassA {
    static Test1 T = new Test1();
    static {
        System.out.println("A");
    }

    public ClassA() {
        System.out.println("C");

    }
}
class  Test1 extends  ClassA{
    static{
        System.out.println("B");

    }


    public Test1() {
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Test1();
    }
}