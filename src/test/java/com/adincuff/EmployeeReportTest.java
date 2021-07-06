package com.adincuff;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.*;

public class EmployeeReportTest {

    private Boolean result;

    @Test
    void itShouldReturnTrueIfTheEmployeeIsAnAdult() {

        // Given
        Employee employee = new Employee("Mike", 51);

        // When
        result = employee.isAnAdult();

        // Then
        assertThat(result).isTrue();

    }

    @Test
    void itShouldReturnFalseIfTheEmployeeIsNotAnAdult() {

        // Given
        Employee employee = new Employee("Max", 17);

        // When
        result = employee.isAnAdult();

        // Then
        assertThat(result).isFalse();

    }

    @Test
    void itShouldReturnListOfAdultEmployeesSortedByNameInReverseOrderAndWithNameInCapitalized() {

        final EmployeeReport employees = buildEmployees();

        assertThat(employees.getAdults()).containsExactly("SEPP", "MIKE");

    }

    public static EmployeeReport buildEmployees() {
        return new EmployeeReport(new Employee("Max", 17), new Employee("Sepp", 18), new Employee("Nina", 15), new Employee("Mike", 51));
    }

}
