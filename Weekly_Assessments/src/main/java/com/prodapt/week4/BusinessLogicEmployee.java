package com.prodapt.week4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BusinessLogicEmployee {
	ArrayList<Employee> addDetails() {
       
        ArrayList<Employee> details= new ArrayList<Employee>();
        details.add(new Employee(8001, "Sethuraman",21, 100000f, "SSE"));
        details.add(new Employee(8002, "Sahishkumar",19, 75000f, "SE"));
        details.add(new Employee(8003, "Siddharth",20, 50000f, "ASE"));
        details.add(new Employee(8004, "Rohieth",18, 40000f, "ASE"));
        
        details.stream().forEach((i)->System.out.println(i));
        return details;
    }

    void processDetails(ArrayList<Employee> details) {
    	System.out.println(":::::::Details After Sorting:::::::");
        
        List < Employee > EmployeeSortedList = details.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());    

            EmployeeSortedList.forEach(i -> System.out.println(i));
    }

}
