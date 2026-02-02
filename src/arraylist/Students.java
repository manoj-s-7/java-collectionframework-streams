package arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Students {
    private String name;
    private int rollno;
    private double cgpa;
    public Students(String name, int rollno, double cgpa) {
        this.name = name;
        this.rollno = rollno;
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }
}
class Collegedb{
    public static void main(String[] args){
        List<Students> students = new ArrayList<>();
        students.add(new Students("Manoj",1140,9.4));
        students.add(new Students("Akash",1120,9.8));
        students.add(new Students("Jhosh",1132,8.9));
        students.add(new Students("Bob",1138,8.9));

        students.sort((a,b)->{
            if (a.getCgpa() - b.getCgpa() > 0)
                return 1;
            else if (a.getCgpa() - b.getCgpa()<0)
                return -1;
            else
                return 0;
        });
//        or
        students.sort(Comparator.comparing(Students::getCgpa).reversed().thenComparing(Students::getName));
        students.forEach(e->System.out.println(e.getName()+" | "+e.getRollno() + " | "+e.getCgpa()));
    }
}