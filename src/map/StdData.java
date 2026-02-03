package map;

public class StdData {
    private String name;
    private String group;
    private double cgpa;

    public StdData(String name, String group, double cgpa) {
        this.name = name;
        this.group = group;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Name : "+ name + " | "+ "Group : "+ group + " | "+ "CGPA : "+ cgpa;
    }
}
