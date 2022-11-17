import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, String> data = new HashMap<String, String>();
        data.put("name", "Alex");
        data.put("age", "45");
        data.put("hobby", "football");

        for(String i: data.keySet()) {
            System.out.println("Ключ: " + i + " Значение: " + data.get(i));
        }
    }
}
