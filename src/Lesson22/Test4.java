package Lesson22;

public class Test4 {

}

class Human2{
    Human2(String n){
        this(n , null);
    }
    Human2(String name , String surname){
        this.name = name;
        this.surname = surname;
    }
    String name;
    String surname;
}

class Student2 extends Human2{
    int course;
    Student2(String name , String surname , int course){
        super(name , surname);
        this.course = course;
    }
    public static void main(String[] args) {
        Student2 s = new Student2("Roma" , "Pesna" , 5);

        System.out.println(s.course);
    }
}