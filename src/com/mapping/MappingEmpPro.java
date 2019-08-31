package com.mapping;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Chirag
 */
public class MappingEmpPro {
    public static void main(String[] args) {
        HashMap<Employee,Project> emppro = new HashMap<>();
        Employee e1 = new Employee(1, "Chirag Choyal", 55000, "Development");
        Employee e2 = new Employee(2, "Anuj Jhawar", 35000, "Development");
        Employee e3 = new Employee(3, "Amrendra Bagga", 45000, "Development");
        Employee e4 = new Employee(4, "Vishnu Pillai", 40000, "Testing");
        Employee e5 = new Employee(5, "Tanish Sharma", 35000, "Testing");
        
        Project p1 = new Project(1, "Zomato", 12, "Manoj Sarwate");
        Project p2 = new Project(2, "Uber Eat", 18, "Yash Joshi");
        Project p3 = new Project(3, "Swiggy", 24, "Tanish Sharma");
        Project p4 = new Project(4, "Foodie", 15, "Yogi Sharma");
        Project p5 = new Project(5, "Jan Dhan Yojna", 28, "Narendra Modi");
        
        emppro.put(e1, p1);
        emppro.put(e2, p2);
        emppro.put(e3, p3);
        emppro.put(e4, p4);
        emppro.put(e5, p5);
        
        for (Map.Entry<Employee, Project> entry : emppro.entrySet()) {
            Employee key = entry.getKey();
            Project value = entry.getValue();
            System.out.println(key+" - "+value);
        }
    }
    
}
