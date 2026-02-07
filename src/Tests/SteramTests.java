package Tests;

import java.util.*;
import java.util.stream.Collectors;


record Project(
        int projectId,
        String projectName,
        String tech
) {}
record Employee(
        int empId,
        String name,
        String department,
        double salary,
        List<Project> projects
) {}

public class SteramTests {
    static void main(String[] args) {
        List<Employee> employees = List.of(

                new Employee(
                        101,
                        "Manoj",
                        "Engineering",
                        75000,
                        List.of(
                                new Project(1, "AI Platform", "Java"),
                                new Project(2, "Web Portal", "React")
                        )
                ),

                new Employee(
                        102,
                        "Rahul",
                        "Engineering",
                        68000,
                        List.of(
                                new Project(3, "Cloud Migration", "AWS"),
                                new Project(1, "AI Platform", "Java")
                        )
                ),

                new Employee(
                        103,
                        "Sneha",
                        "HR",
                        55000,
                        List.of(
                                new Project(4, "HR Analytics", "Python")
                        )
                )
        );
        employees.stream()
                .flatMap(employee -> employee.projects().stream())
                .map(Project::projectName)
                .distinct()
                .peek(System.out::println)
                .toList();

        employees.stream()
                .flatMap(employee -> employee.projects().stream())
                .filter(project -> project.tech().equals("Java"))
                .peek(System.out::println)
                .toList();

        employees.stream()
                .filter(e->e.projects().stream().anyMatch(p->p.projectName().equals("AI Platform")))
                .peek(System.out::println)
                .toList();

        final var stringList = employees.stream()
                .flatMap(e -> e.projects().stream()
                        .map(p -> e.name() + "->" + p.projectName())
                )
                .toList();
        System.out.println(stringList);
        final var stringLongMap = employees.stream()
                .flatMap(e -> e.projects().stream())
                .collect(Collectors.groupingBy(
                        Project::tech,
                        Collectors.counting()
                ));
        System.out.println(stringLongMap);
        Map<String, Employee> highestPaidPerProject =
                employees.stream()
                        .flatMap(emp ->
                                emp.projects().stream()
                                        .map(p -> Map.entry(p.projectName(), emp))
                        )
                        .collect(Collectors.groupingBy(
                                Map.Entry::getKey,
                                Collectors.collectingAndThen(
                                        Collectors.maxBy(
                                                Comparator.comparing(e -> e.getValue().salary())
                                        ),
                                        opt -> opt.get().getValue()
                                )
                        ));

        highestPaidPerProject.forEach((k, v) ->
                System.out.println(k + " → " + v.name())
        );
        Map<String,Integer> map = new HashMap<>();
        map.put("Manoj",1);
        map.put("loki",1);
        map.put("steve",1);
        map.put("tony",1);
        final var entries = map.entrySet();
        System.out.println(entries);


//        test
        final var stringList1 = employees.stream()
                .map(e -> e.name())
                .toList();
        System.out.println(stringList1);

        final var stringList2 = employees.stream()
                .flatMap(e -> e.projects().stream())
                .map(p -> p.projectName())
                .toList();
        System.out.println(stringList2);

        final var stringList3 = employees.stream()
                .flatMap(e -> e.projects().stream())
                .map(e -> e.tech())
                .distinct()
                .toList();
        System.out.println(stringList3);

        final var string = employees.stream()
                .flatMap(e -> e.projects().stream())
                .distinct()
                .collect(Collectors.counting())
                .longValue();
        System.out.println(string);

        final var list1 = employees.stream()
                .filter(e -> e.projects().size() > 1)
                .toList();
        System.out.println(list1);

        final var stringList4 = employees.stream()
                .filter(e -> e.department() == "Engineering")
                .flatMap(e -> e.projects().stream())
                .map(p -> p.projectName())
                .toList();
        System.out.println(stringList4);

        final var stringList5 = employees.stream()
                .flatMap(e -> e.projects().stream()
                        .map(p -> e.name() + "-" + p.projectName())
                )
                .toList();
        System.out.println(stringList5);

        employees.stream()
                .filter(e->e.projects().stream()
                        .anyMatch(p->p.tech().equals("Java"))
                ).toList();


        final var stringLongMap1 = employees.stream()
                .flatMap(e -> e.projects().stream())
                .collect(Collectors.groupingBy(p -> p.tech(),
                                Collectors.mapping(Project::projectName,Collectors.toSet())
                        )
                );
        System.out.println(stringLongMap1);
    }
}

