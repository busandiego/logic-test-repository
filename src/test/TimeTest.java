package test;

import java.lang.reflect.InvocationTargetException;

public class TimeTest {

    public static void main(String[] args) {

        int hour = 0;
        int hour2 = 0;
        for (int i = 0; i < 12; i++) {

            hour = - 6  + i  * 2;
            hour2 = - 6 + (i + 1) * 2;
            System.out.println("hour: " + hour );
            System.out.println("hour2: " + hour2 );

        }
        int hour3 = 0;
        int hour4 = 0;
        for (int i = 0; i < 24; i++) {

            hour3 = - 6  + i  * 1;
            hour4 = - 6 + (i + 1) * 1;
            System.out.println("hour3: " + hour3 );
            System.out.println("hour4: " + hour4 );

        }

    }


}
