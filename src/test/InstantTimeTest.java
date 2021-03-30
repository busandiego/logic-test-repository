package test;


import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantTimeTest {

    public static void main(String[] args) {
        Instant time = Instant.now();

        Instant minusTime = time.minus(1, ChronoUnit.MINUTES);

        Long result = ChronoUnit.MINUTES.between(time, minusTime);
        Long result2 = ChronoUnit.MINUTES.between(minusTime, time);

        System.out.println(result);
        System.out.println(result2);

    }


}
