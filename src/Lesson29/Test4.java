package Lesson29;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Test4 {
    static void smenaDejurnogo(LocalDate nachalo , LocalDate conec , Period p){
        LocalDate data = nachalo;
        while (data.isBefore(conec)){
            System.out.println("Natupila data" + data + ". Pora menyat dejurnogo");
            data = data.plus(p);
        }
    }

    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2016, Month.SEPTEMBER ,1);
        LocalDate conec = LocalDate.of(2017, Month.MAY,31);
        Period p = Period.ofMonths(2);
        smenaDejurnogo(nachalo , conec ,p);
    }
}

