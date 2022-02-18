package butryojantho.sirawitch.lab6;

public class AppleWatchNike extends AppleWatch {

    private double pace;
    private double distance;
    private double time;
    private double avgHeartRate;
    private double maxHeartRate;
    private double sleepHours;

    public AppleWatchNike(String color, double price, String modelName) {
        super(color, price, modelName);
        this.pace = 7;
        this.distance = 7;
        this.time = 49;
        this.avgHeartRate = 145;
        this.maxHeartRate = 160;
        this.sleepHours = 7;
    }

    public AppleWatchNike(String color, double price, String modelName, double pace, double distance, double time,
            double avgHeartRate, double maxHeratRate, double sleepHours) {
        super(color, price, modelName);
        this.pace = pace;
        this.distance = distance;
        this.time = time;
        this.avgHeartRate = avgHeartRate;
        this.maxHeartRate = maxHeratRate;
        this.sleepHours = sleepHours;
    }

    public void setPace(double pace) {
        this.pace = pace;
    }

    public double getPace() {
        return pace;
    }

    public void setdistance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public void setAvgHeartRate(double avgHeartRate) {
        this.avgHeartRate = avgHeartRate;
    }

    public double getAvgHeartRate() {
        return avgHeartRate;
    }

    public void setMaxHeartRate(double maxHeartRate) {
        this.maxHeartRate = maxHeartRate;
    }

    public double getMaxAvgHeartRate() {
        return maxHeartRate;
    }

    public void setSleepHours(double sleepHours) {
        this.sleepHours = sleepHours;
    }

    public double getSleepHours() {
        return sleepHours;
    }

    @Override
    public String toString() {
        return super.toString();
    }


    public void displayRunningStats() {
        System.out.println("Pace: " + this.getPace() + " min/km, distance: " + this.getDistance() + "km., time:" + this.getTime());
    }

    public void displayHeartRates() {
        System.out.println("Avg heart rate: " + this.getAvgHeartRate() + "bpm, max heart rate:" + this.getMaxAvgHeartRate() + " bpm");
    }

    public void displaySleepHours() {
        System.out.println("Sleep hours:" + this.getSleepHours() + " hours");
    }
    
}
