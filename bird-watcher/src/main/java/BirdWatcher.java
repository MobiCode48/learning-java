import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();

    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int bird : this.birdsPerDay) {
            if (bird == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        return Arrays.stream(this.birdsPerDay).limit(numberOfDays).sum();
    }

    public int getBusyDays() {
        int countBusyDays = 0;
        for (int bird : this.birdsPerDay) {
            if (bird >= 5) {
                countBusyDays++;
            }
        }
        return countBusyDays;
    }
}
