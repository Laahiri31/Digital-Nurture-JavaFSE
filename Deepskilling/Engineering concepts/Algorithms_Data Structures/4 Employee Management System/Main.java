public class Main {

    public static void main(String[] args) {

        EmployeeManagement management = new EmployeeManagement(10);

        management.addEmployee(new Employee(101, "Rahul", "Manager", 70000));
        management.addEmployee(new Employee(102, "Priya", "Developer", 55000));
        management.addEmployee(new Employee(103, "Arjun", "Tester", 45000));

        System.out.println("\nEmployee Records:");

        management.displayEmployees();

        System.out.println("\nSearching Employee:");

        Employee employee = management.searchEmployee(102);

        if (employee != null)

            System.out.println(employee);

        else

            System.out.println("Employee Not Found.");

        management.deleteEmployee(103);

        System.out.println("\nAfter Deletion:");

        management.displayEmployees();
    }
}