package hbcu.stay.ready.algor;
import java.util.HashMap;

public class Solution {

    public String countUniqueWords(String input) {

        String result = "";

        HashMap<String, Integer> newmap = new HashMap<>();
        String modifiedInput = input.replace(".", " ");
        String moreModifiedInput = modifiedInput.replaceAll("!", "");
        String[] output = moreModifiedInput.split("");

        for (String x : output) {
            if (newmap.containsKey(x)) {
                newmap.put(x, 1);
            } else {
                newmap.put(x, 1);
            }
        }
        result += String.format("The %d unique words are:\n", newmap.size());
        int size = 0;
        for (String s : newmap.keySet()) {
            size++;
            int value = newmap.get(s);
            if (size < newmap.size()) {
                result += String.format("%s (Seen %d)\n", s, value);
            } else {
                result += String.format("%s (Seen %d)", s, value);
            }
        }
        return result;
    }
}
