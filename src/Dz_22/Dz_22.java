package Dz_22;

public class Dz_22 {

}

class Student{
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3){
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course > 0 & course <= 4){
            this.course = course;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 0 & grade <= 10){
            this.grade = grade;
        }
    }

     void showInfo(){
        System.out.println("Name : " + getName());
        System.out.println("Course : " +getCourse());
        System.out.println("Grade : " + getGrade());
    }
}

class TestStudent{
    public static void main(String[] args) {
        Student st = new Student();
        st.setName(new StringBuilder("Rom"));
        st.setCourse(4);
        st.setGrade(6);
        st.showInfo();

    }
}