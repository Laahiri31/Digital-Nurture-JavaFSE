public class EmployeeManagement {

    private Employee[] employees;
    private int size;

    public EmployeeManagement(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    // Add Employee
    public void addEmployee(Employee employee) {

        if (size < employees.length) {

            employees[size] = employee;
            size++;

            System.out.println("Employee Added Successfully.");

        } else {

            System.out.println("Employee Array is Full.");

        }
    }

    // Search Employee
    public Employee searchEmployee(int id) {

        for (int i = 0; i < size; i++) {

            if (employees[i].employeeId == id) {

                return employees[i];

            }
        }

        return null;
    }

    // Traverse Employees
    public void displayEmployees() {

        if (size == 0) {

            System.out.println("No Employee Records.");

        } else {

            for (int i = 0; i < size; i++) {

                System.out.println(employees[i]);

            }
        }
    }

    // Delete Employee
    public void deleteEmployee(int id) {

        int index = -1;

        for (int i = 0; i < size; i++) {

            if (employees[i].employeeId == id) {

                index = i;
                break;

            }
        }

        if (index == -1) {

            System.out.println("Employee Not Found.");

            return;
        }

        for (int i = index; i < size - 1; i++) {

            employees[i] = employees[i + 1];

        }

        employees[size - 1] = null;
        size--;

        System.out.println("Employee Deleted Successfully.");
    }
}