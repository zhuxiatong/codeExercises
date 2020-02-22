package exercises;

public class GcTest {
    public static void main(String[] args) {
        for (int i= 0; i<3;i++){
            new GcTest();
            //当对象进入从可达状态 变成可恢复状态的时候 发生gc 会调用finclize方法
            //进行资源清理 但是在可恢复状态的时候 重新回去引用 就变成了可达状态
            //如果没有重新获得引用  就会变成 不可达状态 这样就会对象会被系统清理掉
            //System.gc();
            Runtime.getRuntime().gc();
        }
    }
    public void finalize(){
        System.out.println("该对象正在进行finalize");
    }
}
