package test;

import java.time.LocalTime;

public class SplitTest {




    public static void main(String[] args) {
        String a = "RM2021021600010001";
        String value = a.substring(0, 2);
        System.out.println(value);// RM

        String b = "2021-02-25T05:12:31.766770850Z";
        String val = b.substring(14, 16);
        System.out.println(val);

 //   ============offset 한 시간 lastDtoSendDt: 2021-02-25T05:55:16Z
   //     @@@@@@@@@@@@@@@@@@time 값은? 2021-02-25T06:40:25.135403964Z
    //    @@@@@@@@@@@@@@@@@@time2 값은? 2021-02-25T06:38:09.133382797Z
     //   LocalTime startTime = LocalTime.parse(s, 2021-02-25T06:40:25.135403964Z);



    }
}
