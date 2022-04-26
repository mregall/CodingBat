package hr_app;

import java.util.Arrays;

public class Department {

    private String name;
    private Employee[] employees = new Employee[10];
    private int lastIndex = -1;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEmp(Employee anEmployee){
        if (lastIndex < employees.length){
            lastIndex++;
            employees[lastIndex]= anEmployee;
        }
    }

    public Employee[] getEmployees(){
        Employee[] actualEmployees = new Employee[lastIndex+1];
        for (int i = 0; i < actualEmployees.length; i++) {
            actualEmployees[i] = employees[i];
        }
        return actualEmployees;
    }

    public int getEmployeeCount(){
        return lastIndex+1;
    }

    public Employee getEmployeeByID(int empID){
        for (Employee emp : employees){
            if (emp != null) {
                if (emp.getID() == empID) {
                    return emp;
                }
            }
        }
        return null;
    }

    public double getTotalSalary(){
        double totalSalary = 0.0;
        for (int i = 0; i <= lastIndex; i++) {
            totalSalary+= employees[i].getSalary();
        }
        return totalSalary;
    }

    public double getAverageSalary(){
        if (lastIndex > -1){
            return getTotalSalary() / (lastIndex+1);
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employees=" + Arrays.toString(employees) +
                ", lastIndex=" + lastIndex +
                '}';
    }
}








































