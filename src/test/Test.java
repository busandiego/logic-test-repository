package test;

import java.util.Calendar;
import java.util.Date;

public class Test {




    public static void main(String[] args) {

        String targetIds = "33,32,34,";
        String[] userIds = targetIds.split(",");
        for (int i =0; i< userIds.length; i++){
            System.out.println("첫번째 테스트: " + userIds[i]);
        }

        System.out.println(userIds.length); //  3


        String targetIdsTest = "33,32,34";
        String[] userIdsTest = targetIdsTest.split(",");
        for (int i =0; i< userIdsTest.length; i++){
            System.out.println("두번째 테스트: " + userIdsTest[i]);
        }

        System.out.println(userIdsTest.length); //


        // 향상된 for문
        for(String userid : userIdsTest){
            System.out.println("향상 for userid: " + userid);
        }

    }





}
