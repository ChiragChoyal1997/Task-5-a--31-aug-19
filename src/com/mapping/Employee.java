package com.mapping;
import java.util.Objects;
/**
 *
 * @author Chirag
 */
public class Employee {
    private int eno;
    private String ename;
    private int salary;
    private String dept;

    @Override
    public String toString() {
        return "Employee{" + "eno=" + eno + ", ename=" + ename + ", salary=" + salary + ", dept=" + dept + '}';
    }

    @Override
    public int hashCode() {
        return eno;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.eno != other.eno) {
            return false;
        }
//        if (this.salary != other.salary) {
//            return false;
//        }
////        if (!Objects.equals(this.ename, other.ename)) {
////            return false;
////        }
//        if (!Objects.equals(this.dept, other.dept)) {
//            return false;
//        }
        return true;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    
    public Employee(int eno, String ename, int salary, String dept) {
        this.eno = eno;
        this.ename = ename;
        this.salary = salary;
        this.dept = dept;
    }
    
    
}
