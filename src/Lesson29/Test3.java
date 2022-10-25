package Lesson29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test3 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2014,5,15);
        LocalDate localDate2 = LocalDate.of(2012,Month.JUNE,18);
        System.out.println(localDate.isBefore(localDate2));

        LocalTime localTime = LocalTime.of(15,30);
        LocalTime localTime2 = LocalTime.of(03,5 , 18,55598);

        LocalDateTime localDateTime = LocalDateTime.of(2015, Month.SEPTEMBER , 10,17,25);
        LocalDateTime localDateTime2 = LocalDateTime.of(2015, Month.SEPTEMBER , 10,17,25 , 9);

    }

}
