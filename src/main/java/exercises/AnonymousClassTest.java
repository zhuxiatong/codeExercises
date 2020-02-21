package exercises;

public class AnonymousClassTest {
    public static void main(String[] args) {
        int age =0;

        //匿名类访问局部变量  必须添加final
        //但是 java 8 之后可以不添加final
       new Anonymous(){
            @Override
            public void test() {
                System.out.println(age);
                System.out.println("匿名类测试时");
            }
        }.test();




    }

}
interface  Anonymous{
    void test();
}