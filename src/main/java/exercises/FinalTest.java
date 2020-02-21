package exercises;

public class FinalTest {
    public static void main(String[] args) {
        // 变量加上final 当成宏 可以替换
        //Java会使用常量池来管理曾经用过的字符串直接量，
        // 例如执行String a="java";
        // 语句之后，系统的字符串池中就会缓存一个字符串" java "
        // 如果程序再次执行String b="java"
        // 系统将会让b直接指向字符串池中的"java"字符串
        // 因此a==b将会返回true

        final String a = "zxt";
        final String b = "zz";
        String d = "zxtzz";

        String c = a+b;
        System.out.println(c);
        // d he c 的值相等 但是 不是 同一个对象 但是 如果加上 final就在变量池中有了这个值  直接宏替换
        //就变成了true
        System.out.println(d == c);
    }
}
