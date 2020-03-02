package exercises;

import java.util.Random;
import java.util.stream.IntStream;

public class ZXTSortTest {
    public static void main(String[] args) {
        int[] ints = new int[10];
        Random random = new Random(100);
        for (int i = 0; i < ints.length;i++){
            ints[i] = random.nextInt(100);
        }
        //
        System.out.println(ints.length);
        quicklySort(ints,ints.length);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    private static void quicklySort(int[] ints, int length) {
        quicklySortR(ints,0,length-1);
    }

    private static void quicklySortR(int[] ints, int h, int t) {
        if (h >= t){
            return;
        }
        int p = getp(ints,h,t);
        quicklySortR(ints,h,p-1);
        quicklySortR(ints,p+1,t);
    }

    private static int getp(int[] ints, int h, int t) {
        int tmp = ints[t];
        int i = 0;
        int swap = 0;
        for (int j =0;j<t;j++){
            if (ints[j] <tmp){
                swap = ints[j];
                ints[j] =ints[i];
                ints[i] = swap;
                i++;
            }
        }
        swap = ints[i];
        ints[i] = ints[t];
        ints[t] = swap;
        return i;
    }

}
