class MicroBlog {
    public String truncate(String input) {
        StringBuffer buffer = new StringBuffer();
        input.codePoints().limit(5)
                .forEach(buffer::appendCodePoint);
        return buffer.toString();
    }
}
