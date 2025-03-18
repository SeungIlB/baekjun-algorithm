package bronze1;

import java.util.Scanner;

public class DigitalWatch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            String[] startTime = sc.next().split(":");
            String[] endTime = sc.next().split(":");

            int startH = Integer.parseInt(startTime[0]);
            int startM = Integer.parseInt(startTime[1]);
            int startS = Integer.parseInt(startTime[2]);

            int endH = Integer.parseInt(endTime[0]);
            int endM = Integer.parseInt(endTime[1]);
            int endS = Integer.parseInt(endTime[2]);

            int count = 0;

            // 시작 시간부터 종료 시간까지 초 단위로 증가
            while (true) {
                int timeInt = startH * 10000 + startM * 100 + startS;

                if (timeInt % 3 == 0) {
                    count++;
                }

                // 종료 시각 도달하면 종료
                if (startH == endH && startM == endM && startS == endS) {
                    break;
                }

                // 시간 증가
                startS++;
                if (startS == 60) {
                    startS = 0;
                    startM++;
                }
                if (startM == 60) {
                    startM = 0;
                    startH++;
                }
                if (startH == 24) {
                    startH = 0;
                }
            }

            System.out.println(count);
        }
    }
}
