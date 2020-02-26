package exercises;

import java.util.Map;
import java.util.Properties;

public class SysteamTest {
    public static void main(String[] args) {
        Map<String, String> getenv = System.getenv();
        for (String env : getenv.values()){

            System.out.println(env);
        }
        System.out.println("环境变量");
        Properties properties = System.getProperties();
        System.out.println(properties);

    }
}
