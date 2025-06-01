package CollectionsFw;

import java.util.HashMap;
import java.util.Map;

public class MapEg {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1001, "Ravi");
        map.put(1002, "Ishu");
        map.put(1003, "Teja");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }
}
