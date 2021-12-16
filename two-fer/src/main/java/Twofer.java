public class Twofer {
    public String twofer(String name) {
        String printedName = name == null ? "you" : name;
        return "One for " + printedName + ", one for me.";
    }
}
