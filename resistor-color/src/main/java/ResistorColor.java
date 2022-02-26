class ResistorColor {
    private final String[] colors;

    public ResistorColor() {
        colors = colors();
    }

    int colorCode(String color) {
        for(int i = 0; i < colors.length; i++) {
            if(colors[i].equals(color)) {
                return i;
            }
        }
        throw new IllegalArgumentException("no such color in collection: " + color);
    }

    String[] colors() {
        return new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }
}
