
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
        for (int bird:
             birdsPerDay) {
            if (bird == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int limit = numberOfDays > birdsPerDay.length ? birdsPerDay.length : numberOfDays; //can be replaced by Math.min()
        int sumOfBirds = 0;
        for (int i = 0; i < limit; i++) {
            sumOfBirds += birdsPerDay[i];
        }
        return sumOfBirds;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int day:
            birdsPerDay){
            if(day >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
}
