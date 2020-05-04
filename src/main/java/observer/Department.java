package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @ClassName Department
 * @Author ZXT
 * @date 2020.05.03 16:53
 */
public class Department {
    private List<Observer> observers = new ArrayList<>();
    private String depName = "软件学院";
    {
        observers.add(new Student("学生1",depName));
        observers.add(new Student("学生2",depName));
        observers.add(new Teacher("教师1",depName));
    }

    public void setDepName(String depName) {
        this.depName = depName;
        for (Observer observer:observers) {
            observer.changeDo(depName);
        }
    }
    public void showObserver(){
        for (Observer observer:observers) {
            System.out.println(observer);
        }
    }
}
