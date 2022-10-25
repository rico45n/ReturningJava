package Lesson22;

public class Humen {
    private final String pol;
    Humen(String pol){
        this.pol = pol;
    }
  private   StringBuilder name;

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setName(StringBuilder name) {
        this.name = name;
    }

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int vozrast) {
        if (vozrast > 0){
            this.vozrast = vozrast;
        }
    }

    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        if (ves > 0){
            this.ves = ves;
        }
    }

    @Override
    public String toString() {
        return "Humen{" +
                "pol='" + pol + '\'' +
                ", name='" + name + '\'' +
                ", vozrast=" + vozrast +
                ", ves=" + ves +
                '}';
    }

    private int vozrast;
   private int ves;

}

class Test{
    public static void main(String[] args) {
        Humen h1 = new Humen("M");
        h1.setName(new StringBuilder("Roma"));
        h1.setVes(50);
        h1.setVozrast(16);
        System.out.println(h1.toString());
        h1.setVes(-30);
        h1.getName().append("!!!!!!!!!");
        System.out.println(h1.getName());
    }
}