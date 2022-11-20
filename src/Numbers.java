import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Numbers {
    private Map<String, Integer> map = new HashMap<>();

    public void add(String K, Integer V) {
        if (map.containsKey(K) && map.get(K) == V) {
                throw new RuntimeException("Уже существует");
        } else map.put(K, V);
    }

    @Override
    public String toString() {
        String text = "";
        for (String k : map.keySet()) {
            text = text + k + " " + map.get(k) + "\n";
        }
        return text;
    }
}
