package exercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream = new FileInputStream("F:\\codeExercises\\src\\main\\java\\exercises\\FileOutputStreamTest.java");
            FileOutputStream fileOutputStream = new FileOutputStream("FileOutputStreamTest.txt");
            byte[] bytes = new byte[32];
            int hasRead = 0;
            while((hasRead=fileInputStream.read(bytes))>0){
                fileOutputStream.write(bytes,0,hasRead);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
