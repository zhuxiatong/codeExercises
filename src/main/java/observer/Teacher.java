package observer;

/**
 * @Description
 * @ClassName Teacher
 * @Author ZXT
 * @date 2020.05.03 16:52
 */
public class Teacher implements Observer {
    private String teaName;
    private String depName;
    @Override
    public void changeDo(String depName) {
              this.depName = depName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teaName='" + teaName + '\'' +
                ", depName='" + depName + '\'' +
                '}';
    }

    public Teacher(String teaName, String depName) {
        this.teaName = teaName;
        this.depName = depName;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }
}
