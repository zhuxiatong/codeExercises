package exercises;

public class codeBlock {
    public static void main(String[] args) {
        Root root = new Root(3);
    }
}
class Root{

    int a;
    {
        System.out.println("代码块被执行了");
    }
    static  {
        System.out.println("root的静态代码块被执行了");
    }

    public Root(int a) {
        System.out.println("构造方法执行了");
        this.a = a;
    }
}
