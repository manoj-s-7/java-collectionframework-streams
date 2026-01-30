package javasteams;
import java.util.List;
class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private int age;
    private List<Project> projects;

    public Employee(int id, String name, String department, double salary, int age, List<Project> projects) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
        this.projects = projects;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public List<Project> getProjects() {
        return projects;
    }
}
