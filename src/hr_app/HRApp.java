package hr_app;

public class HRApp {
    public static void main(String[] args) {
        System.out.println("HRApp Starts");

        Employee e1 = new Employee(230, "James", 125000);
        Employee e2 = new Employee(231, "Batman", 200000);

        System.out.println(e1);
        System.out.println(e2);

        Department dept = new Department("DevOps");
        dept.addEmp(e1);
        dept.addEmp(e2);

        Employee[] employees = dept.getEmployees();

        for (Employee each : employees){
            System.out.println("Emp: " + each);
        }

        System.out.println("$" + dept.getTotalSalary());
        System.out.println(dept.getAverageSalary());
        System.out.println(dept.getEmployeeByID(230));


    }
}
