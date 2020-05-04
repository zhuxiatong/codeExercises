package observer;

/**
 * @Description
 * @ClassName Main
 * @Author ZXT
 * @date 2020.05.03 17:09
 */
public class Main {
    public static void main(String[] args) {
        Department department = new Department();
        System.out.println("观察目标改变之前的观察者");
        department.showObserver();
        department.setDepName("计算机学院");
        System.out.println("观察目标 改变之后的观察者");
        department.showObserver();
    }
}
