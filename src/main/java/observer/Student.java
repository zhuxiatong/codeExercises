package observer;

/**
 * @Description
 * @ClassName Student
 * @Author ZXT
 * @date 2020.05.03 16:52
 */
public class Student implements Observer{
    private String stuName;
    private String depName;

    @Override
    public void changeDo(String depName) {
        this.depName =depName;

    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", depName='" + depName + '\'' +
                '}';
    }

    public Student(String stuName, String depName) {
        this.stuName = stuName;
        this.depName = depName;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }


}
