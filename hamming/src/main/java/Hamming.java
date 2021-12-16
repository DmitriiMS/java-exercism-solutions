import java.util.stream.IntStream;

public class Hamming {

    private final String left;
    private final String right;
    private final int distance;

    public Hamming(String leftStrand, String rightStrand) {
        if (!rightStrand.isEmpty() &&leftStrand.isEmpty()) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        if (!leftStrand.isEmpty() &&rightStrand.isEmpty()) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        left = leftStrand;
        right = rightStrand;
        distance = IntStream.range(0, left.length()).map(i -> left.charAt(i) != right.charAt(i) ? 1 : 0).sum();
    }

    public int getHammingDistance() {
        return distance;
    }
}
