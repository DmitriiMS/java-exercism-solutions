public class CarsAssemble {
    private final static int DEFAULT_PRODUCTION = 221;

    public double productionRatePerHour(int speed) {
        if (speed  < 5) {
            return DEFAULT_PRODUCTION * speed;
        }
        if (speed < 9) {
            return DEFAULT_PRODUCTION * speed * 0.9;
        }
        if (speed == 9) {
            return DEFAULT_PRODUCTION * speed * 0.8;
        }
        if (speed == 10) {
            return DEFAULT_PRODUCTION * speed * 0.77;
        }
        return 0;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
