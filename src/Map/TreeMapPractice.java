package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<String, Integer>();
        int i = 1;
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            map.put(String.valueOf(ch), i);
            i++;
        }

        System.out.println("All Alphabets Added");
        System.out.println(map.get("M"));
        System.out.println(map);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
