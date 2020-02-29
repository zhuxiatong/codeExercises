package exercises;

import java.io.File;
import java.io.FilenameFilter;

public class FilenameFilterTest {
    public static void main(String[] args) {
        try {
            File file = new File(".");
            String[] list = file.list(new ZXTFilenameFilter());
            for (String s : list) {
                System.out.println(s);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
class ZXTFilenameFilter implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".xml") || new File(name).isFile();
    }
}
