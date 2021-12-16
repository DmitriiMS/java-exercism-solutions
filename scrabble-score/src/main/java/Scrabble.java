import java.util.Map;

class Scrabble {

    private final static int[] LETTER_SCORES = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
    private int score = 0;

    Scrabble(String word) {
       for (char c : word.toUpperCase().toCharArray()) {
           score += LETTER_SCORES[c - 'A'];
       }
    }

    int getScore() {
        return score;
    }

}
