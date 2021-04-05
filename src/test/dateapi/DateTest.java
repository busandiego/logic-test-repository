package test.dateapi;

import java.util.Calendar;
import java.util.Date;

public class DateTest {

    public static void main(String[] args) {


        Calendar time = Calendar.getInstance();

//        for (int i = 0; i < 100; i++) {
//            time.add(Calendar.MINUTE, 1);
//            System.out.println(time.getTime());
//        }
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        date.setHours(0);
        cal.add(Calendar.HOUR, -9 -6);
        cal.add(Calendar.MINUTE, +1);
        System.out.println(cal.getTime());
        for (int i = 0; i < 720; i++) {
            cal.add(Calendar.MINUTE, +1 + 2);
        }

        System.out.println(cal.getTime());


        Date date2 = new Date();
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        date2.setHours(0);
        cal2.add(Calendar.HOUR, -9 -6);
        cal2.add(Calendar.MINUTE, +1);
        System.out.println("cal2: " + cal2.getTime());
        for (int i = 0; i < 720; i++) {
            cal2.add(Calendar.MINUTE, +1 + 2 * i);
        }

        System.out.println("반복후 cal2: " + cal2.getTime());
    }

    //



}