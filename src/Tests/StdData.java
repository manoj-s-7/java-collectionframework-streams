package Tests;

import java.util.Objects;
public class StdData implements Comparable<StdData>{
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

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof StdData stdData)) return false;
        return Double.compare(CGPA, stdData.CGPA) == 0 && Objects.equals(Name, stdData.Name) && Objects.equals(Group, stdData.Group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Group, CGPA);
    }

    @Override
    public int compareTo(StdData o) {
        return Double.compare(this.getCGPA(),o.getCGPA());
    }
}
