class RotationalCipher {

    private int shiftKey;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        char[] chars = data.toCharArray();
        for(int i = 0; i < data.length(); i++) {
            if(chars[i] > 64 & chars[i] < 91) {
                chars[i] = rotateAndCheck(chars[i], 90);
            }
            if(chars[i] > 96 & chars[i] < 123) {
                chars[i] = rotateAndCheck(chars[i], 122);
            }
        }
        return new String(chars);
    }

    char rotateAndCheck(char c, int limit) {
        c += shiftKey;
        if (c > limit) {
            c -= 26;
        }
        return c;
    }
}
