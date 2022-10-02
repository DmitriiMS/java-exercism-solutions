import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordCount {

    public WordCount() {
    }

    public Map<String, Integer> phrase(String string) {
        Map<String, Integer> wordCount = new HashMap<>();
        string = string.toLowerCase(Locale.ROOT).replaceAll("\\s+", " ").strip();
        for (String word : string.split(" |,")) {
            word = word.replaceAll("^[^a-z\\d]+|[^a-z\\d]+$", "");
            if (word.isEmpty()) {
                continue;
            }
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }
}
