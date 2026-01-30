package javasteams;

import java.util.List;

class Business {

    private String name;
    private List<Person> people;

    public Business(String name, List<Person> people) {
        this.name = name;
        this.people = people;
    }

    public String getName() {
        return name;
    }

    public List<Person> getPeople() {
        return people;
    }

    @Override
    public String toString() {
        return "javasteams.Business{" +
                "name='" + name + '\'' +
                ", people=" + people +
                '}';
    }
}