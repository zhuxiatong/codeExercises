package exercises;

public class BaseSupTEST {
    public static void main(String[] args) {
        Sup sup = new Sup();
        //空指针异常 应该管理号父类的方法的权限
        //父类的构造早于子类构造器  在构造中 调用已经被重写的方法
        // 但是这个时候子类还没有初始化变量  就造成了空指针异常
    }
}
class Base{
    public Base() {
        test();
    }
    //将test方法改成private 就行
    public void test() {
        System.out.println("这里是父类中要被覆盖的方法");
    }
}
class Sup extends  Base{
    private String name;
    public Sup() {
    }

    @Override
    public void test() {
        System.out.println(name.length());
    }

}