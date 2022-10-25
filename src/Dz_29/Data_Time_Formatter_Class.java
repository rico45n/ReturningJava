package Dz_29;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Data_Time_Formatter_Class {

    static DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    static DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/YY");

    public static void main(String[] args) {


        LocalDateTime ldt = LocalDateTime.of(2016, Month.JANUARY , 1,9,0, 0);
        LocalDateTime ldt2 = LocalDateTime.of(2016, Month.OCTOBER , 3,9,0,0);


        Period period = Period.of(0,1,2);
        Duration duration= Duration.ofMinutes(600);
        smena(ldt , ldt2,period , duration);
    }


    public static void smena(LocalDateTime nachalo, LocalDateTime konec, Period p , Duration duration){
        LocalDateTime data = nachalo;
        while (data.isBefore(konec)){
            System.out.println("Работаем с: " + data.format(f1));
            data = data.plus(p);
            System.out.println("До: " + data.format(f1));
            System.out.println("Отдыхаем с: " + data.format(f2));
            data = data.plus(duration);
            System.out.println("До: " + data.format(f2));
            System.out.println("__________________________________");

        }
    }
}
