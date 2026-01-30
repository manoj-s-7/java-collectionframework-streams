package javasteams;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SteamTest {
    public static void main(String[] args){
        List<Employee> employees = List.of(
                new Employee(1, "Amit", "Engineering", 90000, 28,
                        List.of(
                                new Project("Alpha", 12, 500000),
                                new Project("Beta", 6, 200000)
                        )
                ),
                new Employee(2, "Neha", "Engineering", 120000, 35,
                        List.of(
                                new Project("Gamma", 24, 800000)
                        )
                ),
                new Employee(3, "Ravi", "HR", 60000, 30,
                        List.of(
                                new Project("RecruitX", 10, 150000)
                        )
                ),
                new Employee(4, "Sneha", "Finance", 110000, 42,
                        List.of(
                                new Project("Audit2024", 18, 300000),
                                new Project("TaxOpt", 8, 120000)
                        )
                ),
                new Employee(5, "Karan", "Engineering", 75000, 25,
                        List.of()
                )
        );
        List<String> names = employees.stream()
                .filter(e -> "Engineering".equals(e.getDepartment()))
                .filter(e->e.getSalary() > 80000)
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .map(Employee::getName)
                .toList();
        names.forEach(System.out::println);
        Optional<String> result =
                employees.stream()
                        .filter(e ->
                                e.getProjects().stream()
                                        .anyMatch(p -> p.getDurationMonths() > 12)
                        )
                        .min(Comparator.comparingInt(Employee::getAge))
                        .map(Employee::getName);
        Optional<String> maxbudget = employees.stream()
                .max(Comparator.comparingDouble(e->
                        e.getProjects().stream()
                                .mapToDouble(Project::getBudget).sum())
                )
                .map(Employee::getDepartment);
        System.out.println(maxbudget);
        List<String> results=
                employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment))
                        .entrySet().stream()
                        .filter(entry ->
                                entry.getValue().stream()
                                        .allMatch(e -> e.getSalary() > 70_000)
                        )
                        .map(Map.Entry::getKey)
                        .toList();
        Map<String, Double> avgSalaryByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)
                        ));
    }
}
