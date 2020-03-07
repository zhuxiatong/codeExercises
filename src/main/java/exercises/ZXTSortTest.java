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
        int p = getPoint(ints,h,t);
        quicklySortR(ints,0,p-1);
        quicklySortR(ints,p+1,t);
    }

    private static int getPoint(int[] ints, int h, int t) {
        int tmp = ints[t];
        int swap = 0;
        int i = h;
        for (int j = h; j<t;j++){
            if (ints[j]<tmp){
                tmp = ints[i];
                ints[i] = ints[j];
                ints[j] = tmp;
                i++;
            }
        }
        tmp = ints[i];
        ints[i] = ints[t];
        ints[t] = tmp;
        return i;
    }


}
