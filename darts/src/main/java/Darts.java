class Darts {
    private double x;
    private double y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {
        double pointRadius = Math.sqrt(x*x + y*y);
        if(pointRadius <= 1.) { return 10; }
        if(pointRadius <= 5.) { return 5; }
        if(pointRadius <= 10.) { return 1; }
        return 0;
    }

}
