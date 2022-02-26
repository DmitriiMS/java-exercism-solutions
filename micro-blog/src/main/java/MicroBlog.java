class MicroBlog {
    public String truncate(String input) {
        return input.codePoints().limit(5)
                .mapToObj(i -> new String((Character.toChars(i))))
                .reduce("", String::concat);
    }
}
