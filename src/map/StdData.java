package map;

public class StdData {
    private String Name;
    private String Group;
    private double CGPA;

    public StdData(String name, String group, double CGPA) {
        Name = name;
        Group = group;
        this.CGPA = CGPA;
    }

    public String getName() {
        return Name;
    }

    public String getGroup() {
        return Group;
    }

    public double getCGPA() {
        return CGPA;
    }

    @Override
    public String toString() {
        return "StdData{" +
                "Name='" + Name + '\'' +
                ", Group='" + Group + '\'' +
                ", CGPA=" + CGPA +
                '}';
    }
}
