package main.java.parkingbill;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Parkingbill {
    public static final int FIX = 2;
    public static final int FIRSTHOUR = 3;
    public static final int AFTER = 4;

    private static int calculateParkingBill(String E, String L) {
        //String format = "HH:mm";
        String format = "[H:]m";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        LocalTime etime = LocalTime.parse(E, formatter);
        LocalTime ltime = LocalTime.parse(L, formatter);
        int cost = FIX;

        if (ltime.getHour() > etime.getHour()) {
            cost += FIRSTHOUR;
            cost += AFTER * ((ltime.getHour()-etime.getHour())-1);
            if (ltime.getMinute() > etime.getMinute()){
                cost += AFTER;
            }
        }else{
            if(ltime.getMinute() > etime.getMinute()){
                cost += FIRSTHOUR;
            }
        }
        return cost;
    }
    public static void main(String[] args) {
        System.out.println(calculateParkingBill("9:30", "10:30"));
    }
}
