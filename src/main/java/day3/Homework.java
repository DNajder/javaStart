package day3;

import java.time.LocalDateTime;

public class Homework {
    public static void main(String[] args) {
        task4();
        System.out.println("Otrzymałeś ocenę " + testResult(54));
        System.out.println("Otrzymałeś ocenę " + testResult(47));
        System.out.println("Otrzymałeś ocenę " + testResult(91));
        testResultVoid(63);
        testResultVoid(15);

    }

    public static void task4() {
        LocalDateTime actualTime = LocalDateTime.now();
        int day = actualTime.getDayOfMonth();
        int monat = actualTime.getMonthValue();
        int year = actualTime.getYear();
        int hour = actualTime.getHour();
        int minute = actualTime.getMinute();
        String haurValue;
        if (hour < 10) {
            haurValue = "0" + hour;
        } else {
            haurValue = Integer.toString(hour);
        }
        String minuteValue = minute < 10 ? "0" + minute : "" + minute;
        System.out.println(haurValue + ":" + minuteValue + "" + day + "." + monat + "." + year);
        System.out.println("Od polnocy Minelo " + (hour * 60 + minute) + " minut.");
    }

    public static String testResult(int pts) {
        if (pts < 50) {
            return "1";
        }
        return calculateResultWhenExamIsPassed(pts);
    }

    public static String calculateResultWhenExamIsPassed(int pts) {
        if (pts < 60) {
            return "2";
        } else if (pts < 70) {
            return "3";
        } else if (pts < 80) {
            return "4";
        } else if (pts < 90) {
            return "5";
        }
        return "6";
    }

    public static void testResultVoid(int pts) {
        if (pts < 50) {
            System.out.println("1");
        } else {
            System.out.println(calculateResultWhenExamIsPassed(pts));
        }
    }

}
