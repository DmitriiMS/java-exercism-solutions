import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.IntStream;

class Grains {
    public static void main(String[] args) {
        long[] times = new long[1000000];
        long start, end;
        for(int i = 0; i < 1000000; i++){
            start  = System.nanoTime();
            grainsOnBoard();
            end = System.nanoTime();
            times[i] = end - start;
        }
        System.out.println(Arrays.stream(times).average());
    }

    static BigInteger grainsOnSquare(final int square) {
        if(square <= 0 || square > 64){
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        return new BigInteger("2").pow(square-1);
    }

    static BigInteger grainsOnBoard() {
        return IntStream.range(1,65)
                .mapToObj(Grains::grainsOnSquare)
                .reduce(BigInteger.valueOf(0),BigInteger::add);
    }
}
