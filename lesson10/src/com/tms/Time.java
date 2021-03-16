package com.tms;

public class Time {
    private int hour;
    private int minute;
    private int second;
    //int hr;
    //int min;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public Time(int hour, int minute, int second) {
        this.second = second;
        if (second >= 60) {
            minute= this.minute / 60;
            this.second = second % 60;
        }
        this.minute = minute;
        if (minute >= 60) {
            minute = this.minute / 60;
            this.minute = minute % 60;
        }
        this.hour = hour ;

    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }



    int secondsamount() {
        return getHour() * 60 * 60 + getMinute() * 60 + getSecond();
    }

    void compareTo(Time a) {
        if (this.secondsamount() > a.secondsamount()) {
            System.out.println(this + " It is bigger!!!");
        } else if (this.secondsamount() < a.secondsamount()) {
            System.out.println(a + " It is bigger!!");
        } else {
            System.out.println("It is identical.");
        }


    }
}