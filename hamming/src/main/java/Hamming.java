public class Hamming {

    private String left;
    private String right;
    private int distance = 0;

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
        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) != right.charAt(i)) {
                distance++;
            }
        }
    }

    public int getHammingDistance() {
        return distance;
    }
}
