class SqueakyClean {
    static String clean(String identifier) {
        String partiallyCleaned = identifier.replaceAll(" ", "_")
               .replaceAll("\\\0", "CTRL")
               .replaceAll("[α-ω, 0-9]", "");
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < partiallyCleaned.length(); i++){
            Character c = partiallyCleaned.charAt(i);
            if (c.equals('-')) {
                c = partiallyCleaned.charAt(++i);
                b.append(Character.toUpperCase(c));
                continue;
            }
            if (!Character.isLetterOrDigit(c) && !c.equals('_')) continue;
            b.append(c);
        }
        return b.toString();
    }
}
