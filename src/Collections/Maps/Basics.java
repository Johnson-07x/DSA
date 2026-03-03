package Collections.Maps;

import java.util.Map;
import java.util.TreeMap;

public class Basics {
    static void main(String[] args) {
        Map<String, Integer> m = new TreeMap<>();
        m.put("RcB", 7307);
        m.put("RCB", 6007);
        m.put("rcb", 73);
        m.put("RCb", 73);
        System.out.println(m);
    }
}
