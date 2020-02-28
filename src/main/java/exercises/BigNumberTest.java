package exercises;

import java.util.Scanner;

public class BigNumberTest {
    public static String bigNumberAdd(String num1,String num2){
        char[] a = new StringBuffer(num1).reverse().toString().toCharArray();
        char[] b = new StringBuffer(num2).reverse().toString().toCharArray();
        int lenA = a.length;
        int lenB = b.length;
        int len = lenA > lenB ? lenA :lenB;
        int[] result = new int[len+1];
        for (int i = 0; i < len + 1 ; i++){
            int aint = i < lenA ? (a[i] - '0') : 0;
            int bint = i < lenB ? (b[i] - '0') : 0;
            result[i] = aint + bint;
        }
        for (int i = 0; i<result.length; i++){
            if (result[i] >10){
                result[i+1] += result[i] / 10;
                result[i] %= 10;
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        boolean flag = true;
        for (int i = len; i >= 0; i--){
            if (result[i] == 0 && flag){
                continue;
            }else{
                flag = false;
            }
            stringBuffer.append(result[i]);
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个大数");
        String a = scanner.next();
        String b = scanner.next();
        System.out.println(bigNumberAdd(a, b));

    }
}
