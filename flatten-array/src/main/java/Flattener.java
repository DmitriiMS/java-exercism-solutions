import java.util.*;

public class Flattener {

    private List<Object> flatList = new ArrayList<>();

    public Flattener() {

    }

    public List<Object> flatten(List<Object> nested) {
        recursiveAddToFlatList(nested);

        return flatList;
    }

    private void recursiveAddToFlatList(List<Object> list) {
        for (Object o : list) {
            if (o == null) {
                continue;
            }
            if (o instanceof List<?>) {
                recursiveAddToFlatList((List<Object>) o);
                continue;
            }
            flatList.add(o);
        }
    }
}
