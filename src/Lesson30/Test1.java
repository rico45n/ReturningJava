package Lesson30;

import java.util.ArrayList;

public class Test1 {



}
//class Student{
//    String name;
//    char sex;
//    int age;
//    int course;
//    double avgGrade;
//    Student(String name,char sex, int age,int course,double avgGrade){
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.course = course;
//        this.avgGrade = avgGrade;
//    }
//}
//
//
//class StudentInfo{
//    void printStudent(Student st){
//        System.out.println("Imya stydenta: " + st.name + ", pol: " + st.sex + ", vozrast: " + st.age + ", kurs: " + st.course + ", srednya ocenka: " + st.avgGrade);
//    }
//
//    void printStudentOverGrade(ArrayList<Student> aL , double avgGrade){
//        for (Student s : aL){
//            if (s.avgGrade > avgGrade){
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudentUnderGrade(ArrayList<Student> aL , double avgGrade){
//        for (Student s : aL){
//            if (s.avgGrade < avgGrade){
//                printStudent(s);
//            }
//        }
//    }
//    void printStudentOverAge(ArrayList<Student> aL , int age){
//        for (Student s : aL){
//            if (s.age > age){
//                printStudent(s);
//            }
//        }
//    }
//    void printStudentUnderAge(ArrayList<Student> aL , int age){
//        for (Student s : aL){
//            if (s.age < age){
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudentBySex(ArrayList<Student> aL , char sex){
//        for (Student s : aL){
//            if (s.sex == sex){
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudentMixConditions(ArrayList<Student> aL ,double avg , int age, char sex){
//        for (Student s : aL){
//            if (s.avgGrade > avg && s.age < age && s.sex == sex){
//                printStudent(s);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Student> list = new ArrayList<>();
//        Student st1 = new Student("Roman" , 'M', 20 , 4 ,4.5);
//        Student st2 = new Student("Danyl" , 'M', 21 , 3 ,6);
//        Student st3 = new Student("Marya" , 'W', 22 , 2 ,5.5);
//        Student st4 = new Student("Ivan" , 'M', 22 , 2 ,6);
//        Student st5 = new Student("Darya" , 'W', 20 , 4 ,4.5);
//        list.add(st1);
//        list.add(st2);
//        list.add(st3);
//        list.add(st4);
//        list.add(st5);
//        StudentInfo studentInfo = new StudentInfo();
////        studentInfo.printStudentOverGrade(list,5);
//        studentInfo.printStudentUnderGrade(list,5);
//    }
//}
