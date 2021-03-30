package test;


import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantTimeTest {

    public static void main(String[] args) {
        Instant time = Instant.now();

        Instant minusTime = time.minus(1, ChronoUnit.MINUTES);

        Long result = ChronoUnit.MINUTES.between(time, minusTime);
        Long result2 = ChronoUnit.MINUTES.between(minusTime, time);

        // System.out.println(result);
        // System.out.println(result2);
        //ChronoUnit.MILLIS

        // 시간이 다른 분의 계산은 어떻게 값이 나올까
        //
        Instant instant = Instant.parse("2018-12-30T19:34:50.63Z");
        Instant instant2 = Instant.parse("2018-12-30T19:35:50.63Z");
        Instant instant3 = Instant.parse("2018-12-30T20:35:50.63Z");

        System.out.println("hour 같을 때: " + ChronoUnit.MINUTES.between(instant, instant2));
        System.out.println("hour 다를 때: " + ChronoUnit.MINUTES.between(instant, instant3));
        // 분 차이만큼 나와줌

    }


}
