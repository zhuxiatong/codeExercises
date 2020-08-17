package exercises;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(calendar.getTime());
        System.out.println(format);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.AM_PM));
        System.out.println(calendar.getTime());
        calendar.set(2019,5,5,14,35,20);
        System.out.println(calendar.getTime());


        calendar.roll(Calendar.YEAR,-1);

        calendar.roll(Calendar.DAY_OF_WEEK,-6);
        System.out.println(calendar.getTime());
    }
}
