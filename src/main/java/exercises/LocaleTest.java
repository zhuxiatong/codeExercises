package exercises;

import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        Locale[] availableLocales = Locale.getAvailableLocales();
        for(int i=0;i<availableLocales.length;i++){
            System.out.println( availableLocales[i].getDisplayCountry()+" "+availableLocales[i].getCountry());
        }
    }
}
