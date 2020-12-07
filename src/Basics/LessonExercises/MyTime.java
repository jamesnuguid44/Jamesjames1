package Basics.LessonExercises;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    // SETTERS
    public void setHour(int hourr){
        hour = hourr;
    }

    public void setMinute(int minutee){
        minute = minutee;
    }

    public void setSecond(int secondd){
        second = secondd;
    }

    // GETTERS
    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        String time = "Time>> "+ (hour < 10 ? "0"+hour:hour) +":"+ (minute<10? "0"+minute:minute) +":"+ (second<10? "O"+second: second);
    return time;
    }
}
