package dz26;

public class Student {
   private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(name);
        return name2;
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
        if(course <= 4){
            this.course = course;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(grade <= 10){
            this.grade = grade;
        }
    }

    public void showInfo(Student st){

        System.out.println("Name: " +st.getName());
        System.out.println("Course: " + st.getCourse());
        System.out.println("Grade: " + st.getGrade());
    }
}

class Test{
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName(new StringBuilder("Roman"));
        st1.setGrade(9);
        st1.setCourse(4);

        st1.showInfo(st1);
    }
}