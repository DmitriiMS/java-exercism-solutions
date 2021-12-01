class NeedForSpeed {
    // TODO: define the constructor for the 'NeedForSpeed' class
    private int charge  = 100;
    private int distanceDriven = 0;
    private final int drain;
    private final int speed;

    public NeedForSpeed(int speed, int drain) {
        this.speed = speed;
        this.drain = drain;
    }

    public boolean batteryDrained() {
        return charge <= 0;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
            charge -= drain;
            distanceDriven += speed;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    // TODO: define the constructor for the 'RaceTrack' class
    private final int length;

    public RaceTrack(int length) {
        this.length = length;
    }

    public boolean carCanFinish(NeedForSpeed car) {
        while(!car.batteryDrained()) {
            car.drive();
        }
        return car.distanceDriven() >= length;
    }
}
