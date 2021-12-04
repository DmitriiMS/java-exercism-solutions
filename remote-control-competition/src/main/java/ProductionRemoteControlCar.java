class ProductionRemoteControlCar implements RemoteControlCar{
    private int distance = 0;
    private int speed = 10;
    private int numberOfVictories;

    public void drive() {
        distance += speed;
    }

    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberofVictories) {
        this.numberOfVictories = numberofVictories;
    }
}
