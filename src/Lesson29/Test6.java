package Lesson29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Test6 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2016 , Month.SEPTEMBER , 1);
        LocalDateTime ldt = LocalDateTime.of(2016 , Month.SEPTEMBER , 1 , 16 ,40);
        LocalTime lt = LocalTime.of(16 ,40);
        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(ld);
        System.out.println(lt.format(d1));
    }
}
