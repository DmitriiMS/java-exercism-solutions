import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> shake = new ArrayList<Signal>();
        String binaryNum = new StringBuilder(Integer.toBinaryString(number)).reverse().toString();
        for (int i = 0; i < binaryNum.length() && i < 4; i++) {
            if (binaryNum.charAt(i) == '1') {
                shake.add(Signal.values()[i]);
            }
        }
        if (binaryNum.length() > 4 && binaryNum.charAt(4) == '1') { Collections.reverse(shake); }
        return shake;
    }

}
