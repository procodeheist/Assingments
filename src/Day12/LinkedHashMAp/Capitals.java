package Day12.LinkedHashMAp;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Capitals {
    public static void main(String[] args) {
        Map<String,String> captialMap = new LinkedHashMap<>();
        captialMap.put("Kerala","Thiruvananthapuram");
        captialMap.put("Goa","Panaji");
        captialMap.put("Bihar","Patna");
        captialMap.put("TamilNadu","Chennai");
        captialMap.put("Jharkhand","Ranchi");

        Set<Map.Entry<String,String>> capitalSet = captialMap.entrySet();

        for (Map.Entry<String,String> set:capitalSet){
            System.out.println(set.getKey()+"==>"+set.getValue());
        }
    }
}
