package exercises;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TypeTest {
    public static void main(String[] args) {

    }
    public static String  getMapToString(Map<String,String> map){
        Set<String> keySet = map.keySet();
        String[] keyArray = keySet.toArray(new String[keySet.size()]);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0;i<keyArray.length;i++){
            if (map.get(keyArray[i]).trim().length() > 0){
                stringBuffer.append(keyArray[i]).append("=").append(map.get(keyArray[i]));

            }
            if(i != keyArray.length-1){
                stringBuffer.append("&");
            }
        }
        return stringBuffer.toString();

    }
    public  static Map<String,String>   getStringToMap(String str){
        if (null == str ||"".equals(str) ){
            return null;
        }
        String[] strings = str.split("&");
        int maplength = strings.length;
        if ((strings.length %2) != 0){
            maplength = maplength+1;
        }
        HashMap<String, String> map = new HashMap<>(maplength);
        for (int i=0; i<strings.length;i++){
            String[] split = strings[i].split("=");
            map.put(split[0],split[2]);
        }
        return map;
    }
}
