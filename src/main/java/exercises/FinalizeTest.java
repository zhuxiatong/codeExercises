package exercises;

public class FinalizeTest {

    public static FinalizeTest f;

    public static void main(String[] args) throws InterruptedException {
        new FinalizeTest();

        Runtime.getRuntime().gc();

        Thread.sleep(200);
        f.info();
    }

    private void info() {
        System.out.println("测试该对象仍让存在");
    }
    public void finalize(){
        // 让对象在可恢复状态 重新获得引用 变成
        // 可达状态
        f =this;
    }
}
