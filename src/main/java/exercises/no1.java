package exercises;

/**
 * @author zxt
 * @version 1.0
 * @date 2020/3/16 20:03
 */
public class no1 {
    public static void main(String[] args) {

    }
    public static int  StringToInt(String str){
        char[] chars = str.toCharArray();
        int res=0;
        if (chars.length<=0){
            throw new RuntimeException("输入字符串为空");
        }
        for (int i= 0 ; i<chars.length ;i++){
            res +=chars[i] -'0';
        }
        return res;
    }
}
