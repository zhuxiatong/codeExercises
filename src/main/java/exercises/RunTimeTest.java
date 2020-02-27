package exercises;

import java.io.IOException;

public class RunTimeTest {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("处理器数量" + runtime.availableProcessors());
        System.out.println("空余内存" + runtime.freeMemory());
        System.out.println("最大内存"+runtime.maxMemory());
        System.out.println("系统调用");
        runtime.exec("notepad.exe");
        System.out.println("sss" instanceof String);
    }
}
