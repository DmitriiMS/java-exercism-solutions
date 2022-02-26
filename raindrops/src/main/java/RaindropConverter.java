class RaindropConverter {

    String convert(int number) {
        String result = "";
        if (number % 3 == 0) {
            result = result.concat("Pling");
        }
        if (number % 5 == 0) {
            result = result.concat("Plang");
        }
        if (number % 7 == 0) {
            result = result.concat("Plong");
        }
        if (result.isEmpty()) {
            return Integer.toString(number);
        }
        return result;
    }
}
