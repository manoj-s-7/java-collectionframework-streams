package javasteams;

class Project {
    private String projectName;
    private int durationMonths;
    private double budget;

    public Project(String projectName, int durationMonths, double budget) {
        this.projectName = projectName;
        this.durationMonths = durationMonths;
        this.budget = budget;
    }

    public String getProjectName() {
        return projectName;
    }

    public int getDurationMonths() {
        return durationMonths;
    }

    public double getBudget() {
        return budget;
    }
}
