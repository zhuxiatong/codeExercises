package exercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeMutable {
    public static void main(String[] args) {
        try{
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.txt"));
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.txt"));
            Person zxt = new Person("zxt");
            objectOutputStream.writeObject(zxt);
            Person z = (Person) objectInputStream.readObject();
            System.out.println(z);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
