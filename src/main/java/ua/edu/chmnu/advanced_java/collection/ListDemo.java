package ua.edu.chmnu.advanced_java.collection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListDemo {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    static class Employee {
        private String name;

        private String department;

        private String position;

        private double salary;
    }

    public static void main(String[] args) {
        List<Employee> pe = new ArrayList<>() {
            {
                add(
                        Employee.builder()
                                .name("John")
                                .department("Accounting")
                                .position("Manager")
                                .salary(5000)
                                .build()
                );

                add(
                        Employee.builder()
                                .name("Jenny")
                                .department("Accounting")
                                .position("Accounter")
                                .salary(2550)
                                .build()
                );

                add(
                        Employee.builder()
                                .name("Lora")
                                .department("Accounting")
                                .position("Accounter")
                                .salary(2650)
                                .build()
                );
            }
        };

        pe.add(
                Employee.builder()
                        .name("Derek")
                        .department("Service")
                        .position("Master")
                        .salary(4500)
                        .build()
        );

        pe.add(
                Employee.builder()
                        .name("William")
                        .department("Service")
                        .position("Chief master")
                        .salary(3700)
                        .build()
        );

        pe.add(
                Employee.builder()
                        .name("Hold")
                        .department("Service")
                        .position("Junior master")
                        .salary(1700)
                        .build()
        );

        {
            Optional<Employee> minSalaryE = pe.stream().min(new EmployeeSalaryComparator());
            System.out.println(minSalaryE);

            Optional<Employee> maxSalaryE = pe.stream().max(new EmployeeSalaryComparator());
            System.out.println(maxSalaryE);
        }

        {
            Optional<Employee> minSalaryE = pe.stream()
                    .filter(e -> e.getDepartment().equalsIgnoreCase("Service"))
                    .min(new EmployeeSalaryComparator());
            System.out.println(minSalaryE);

            Optional<Employee> maxSalaryE = pe.stream()
                    .filter(e -> e.getDepartment().equalsIgnoreCase("Service"))
                    .max(new EmployeeSalaryComparator());
            System.out.println(maxSalaryE);
        }

        {
            List<Double> allSalary = pe.stream()
                    .map(Employee::getSalary)
                    .collect(Collectors.toList());

            List<Double> serviceSalary = pe.stream()
                    .filter(e -> e.getDepartment().equalsIgnoreCase("Service"))
                    .map(Employee::getSalary)
                    .collect(Collectors.toList());
        }

    }

    private static class EmployeeSalaryComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            if (o1.getSalary() < o2.getSalary()) {
                return -1;
            }

            if (o1.getSalary() > o2.getSalary()) {
                return 1;
            }

            return 0;
        }
    }
}
