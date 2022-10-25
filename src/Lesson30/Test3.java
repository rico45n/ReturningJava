package Lesson30;

import java.util.ArrayList;

public class Test3 {
}
class Student{
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    Student(String name,char sex, int age,int course,double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}


class StudentInfo{
    void printStudent(Student st){
        System.out.println("Imya stydenta: " + st.name + ", pol: " + st.sex + ", vozrast: " + st.age + ", kurs: " + st.course + ", srednya ocenka: " + st.avgGrade);
    }

    void testStudent(ArrayList<Student> students , StudentCheck studentCheck){
        for (Student s: students){
            if (studentCheck.testStudent(s)){
                printStudent(s);
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Roman" , 'M', 20 , 4 ,4.5);
        Student st2 = new Student("Danyl" , 'M', 21 , 3 ,6);
        Student st3 = new Student("Marya" , 'W', 22 , 2 ,5.5);
        Student st4 = new Student("Ivan" , 'M', 22 , 2 ,6);
        Student st5 = new Student("Darya" , 'W', 20 , 4 ,4.5);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo si = new StudentInfo();

        si.testStudent(list,st -> st.avgGrade > 5);
        si.testStudent(list,(Student st) -> {return st.avgGrade < 6;});
        si.testStudent(list,(Student st) -> {return st.age > 20;});
        si.testStudent(list,(Student st) -> {return st.age < 25;});
        si.testStudent(list,(Student st) -> {return st.sex == 'M';});


    }
}

@FunctionalInterface
interface StudentCheck{
    boolean testStudent(Student s);
}

