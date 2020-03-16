package exercises;

import java.util.Random;

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
        quicklySortC(ints,0,length-1);
    }

    private static void quicklySortC(int[] ints, int h, int t) {
        if (h >t){
            return;
        }
        int p = getPoint(ints,h,t);
        quicklySortC(ints,h,p-1);
        quicklySortC(ints,p+1,t);
    }

    private static int getPoint(int[] ints, int h, int t) {
        int p = ints[t];
        int swap = 0;
        int i = h;
        for (int j = h; j<t;j++){
            if (ints[j] < p){
                swap = ints[j];
                ints[j] = ints[i];
                ints[i] = swap;
                i++;
            }
        }
        swap = ints[i];
        ints[i] = ints[t];
        ints[t] =swap;
        return i;

    }


}
