import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class ResistorColorDuo {
    private final Map<String, Integer> colorCodes = new HashMap<>();

    public ResistorColorDuo() {
        String[] colors = new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        for(int i = 0; i < colors.length; i++){
            colorCodes.put(colors[i], i);
        }
    }

    int value(String[] colors) {
        return Arrays.stream(colors).limit(2).mapToInt(colorCodes::get).reduce(0, (a, b) -> a * 10 + b);
    }
}
