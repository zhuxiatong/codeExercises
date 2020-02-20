package exercises;

public class SubThisTest {
    public static void main(String[] args) {
        ZXT zxt = new ZXT();
        System.out.println(zxt.a);
    }
}
class Man{
    public Man() {
        System.out.println("人类构造器");
    }
}
class ZXT extends Man {
    int  a;

    public ZXT() {
        this(0);
    }

    public ZXT(int a) {
        System.out.println("这里是本类的构造器");
        this.a = a;
    }
}