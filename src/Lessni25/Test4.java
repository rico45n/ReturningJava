package Lessni25;

public class Test4 {
    public static void main(String[] args) {
        String [] array1 = {"Privet" , "Poka"};
        Object [] array2 = array1;
        String [] array3 = (String[]) array2;
        array2[0] = new StringBuffer("ge");
    }
}
