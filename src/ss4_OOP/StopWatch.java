package ss4_OOP;

public class StopWatch {
    private double startTime;
    private double endTime;

    public StopWatch(double startTime, double endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public StopWatch() {}

    public double getStartTime(){ return startTime; }
    public double getEndTime(){ return endTime; }

    public void setStartTime(double startTime){ this.startTime = startTime; }
    public void setEndTime(double endTime){ this.endTime = endTime; }

}
