import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay.length == 0 ? 0 : birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        //here starts some advanced magic that I discovered while exploring
        return Arrays.binarySearch(birdsPerDay, 0) >= 0;
    }

    public int getCountForFirstDays(int numberOfDays) {
        //functional
        return Arrays.stream(birdsPerDay).limit(Math.min(numberOfDays, birdsPerDay.length)).sum();
    }

    public int getBusyDays() {
        //elegant
       return (int) Arrays.stream(birdsPerDay).filter(i -> i >= 5).count();
    }
}
