package Lesson29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2014,5,15);
        System.out.println(localDate);
        LocalDate localDate2 = localDate.plusDays(5);
        System.out.println(localDate2);

        LocalTime localTime = LocalTime.of(15,30);
        System.out.println(localTime);
        localTime = localTime.plusHours(5);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.of(2015,Month.SEPTEMBER , 10,17,25);
        System.out.println(localDateTime);
    }
}
