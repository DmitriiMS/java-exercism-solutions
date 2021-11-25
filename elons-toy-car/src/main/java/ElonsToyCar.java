public class ElonsToyCar {

    private int distance = 0;
    private int charge = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        if (charge == 0) return "Battery empty";
        return "Battery at " + charge + "%";
    }

    public void drive() {
        if (charge > 0) {
            distance += 20;
            charge -= 1;
        }
    }
}
