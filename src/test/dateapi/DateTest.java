package test.dateapi;

import java.util.Calendar;

public class DateTest {

    public static void main(String[] args) {


        Calendar time = Calendar.getInstance();

        for (int i = 0; i < 100; i++) {
            time.add(Calendar.MINUTE, 1);
            System.out.println(time.getTime());
        }

    }
}