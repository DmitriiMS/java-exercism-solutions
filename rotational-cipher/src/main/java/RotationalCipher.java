class RotationalCipher {

    private int shiftKey;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        char[] rotated = new char[data.length()];
        for(int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);
            if(c > 64 & c < 91) {
                c = rotateUppercase(c);
            }
            if(c > 96 & c < 123) {
                c = rotateLowercase(c);
            }
            rotated[i] = c;
        }
        return new String(rotated);
    }

    char rotateLowercase(char c) {
        c += shiftKey;
        if (c > 122) {
            c = (char) (96 + (c - 122));
        }
        return c;
    }

    char rotateUppercase(char c) {
        c += shiftKey;
        if (c > 90) {
            c = (char) (64 + (c - 90));
        }
        return c;
    }

}
