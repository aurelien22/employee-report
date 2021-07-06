package com.adincuff;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeReport {

    private final List<Employee> employees;


    public EmployeeReport(Employee... employees) {
        this.employees = Arrays.asList(employees);
    }

    public Collection<String> getAdults() {
        return employees
                .stream()
                .filter(Employee::isAnAdult)
                .map(Employee::getName)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toUnmodifiableList());
    }
}
