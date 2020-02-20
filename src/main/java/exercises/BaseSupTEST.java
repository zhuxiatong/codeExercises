package exercises;

public class BaseSupTEST {
    public static void main(String[] args) {
        Sup sup = new Sup();
        //空指针异常 应该管理号父类的方法的权限
        //父类的构造早于子类构造器  在构造中 调用已经被重写的方法
        //就像类成员（包括方法、初始化块、内部类和枚举类）不能访问实例成员（包括Field、方法、初始化块、内部类和枚举类）
        // 因为类成员是属于类的，类成员的作用域比实例成员的作用域更大，完全可能出现类成员已经初始化完成
        // 但实例成员还不曾初始化的情况，如果允许类成员访问实例成员将会引起大量错误。
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