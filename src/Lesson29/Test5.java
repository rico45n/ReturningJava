package Lesson29;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Test5 {
    static void smenaGoda(LocalDate nachalo , LocalDate conec , Period p){
        LocalDate data = nachalo;

        while (data.isBefore(conec)){
            data = data.plus(p);
            System.out.println(data);
        }
        System.out.println("Natupila conec goda:" + data);
    }
    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2016,1,1);
        LocalDate conec = LocalDate.of(2017, 1,1);
        Period p = Period.ofMonths(1);
        smenaGoda(nachalo , conec ,p);

    }
}
