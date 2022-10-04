import java.util.List;

public  class BinarySearch {

    private List<Integer> sortedList;

    public BinarySearch(List<Integer> sortedList) {
        this.sortedList = sortedList;
    }

    public int indexOf(int element) throws ValueNotFoundException {
        if (sortedList.size() == 0) {
            throw new ValueNotFoundException("Value not in array");
        }
        int l = 0;
        int r = sortedList.size() - 1;
        int m = 0;
        while (l != r) {
            m = (int) Math.ceil((l + r) / 2.);
            if (sortedList.get(m) > element) {
                r = m - 1;
            } else {
                l = m;
            }
        }
        if (sortedList.get(l) == element) {
            return l;
        }
        throw new ValueNotFoundException("Value not in array");
    }
}
