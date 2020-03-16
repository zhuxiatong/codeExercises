package exercises;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author zxt
 * @version 1.0
 * @date 2020/3/16 12:53
 */
public class ZXTReflect {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        System.out.println(personClass.getName());

        Field[] fields = personClass.getFields();
        Constructor constructor = personClass.getConstructor(String.class);
        Person person = (Person) constructor.newInstance("zz");
        System.out.println(person);
        for (Field field : fields) {
            int modifiers = field.getModifiers();
            System.out.println(Modifier.toString(modifiers) + " ");
            System.out.println(field.getType().getName() + " " + field.getName() + " ");
        }
    }
}
