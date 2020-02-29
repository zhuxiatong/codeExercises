package exercises;

import java.io.Serializable;

public class Person  implements Serializable {
//    {
//        System.out.println("静态代码块执行了");
//    }
    static int num;
    private String name;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public Person(String name) {
        System.out.println("构造方法执行了");
        this.name = name;
        this.num++;
    }


}
