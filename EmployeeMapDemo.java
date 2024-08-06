public class EmployeeMapDemo {
    public static void main(String[] args) {
        EmployeeMap employeeMap = new EmployeeMap();

        Employee employee1 = new Employee(101, "John Doe");
        Employee employee2 = new Employee(102, "Jane Smith");
        Employee employee3 = new Employee(103, "Bob Johnson");

        employeeMap.addEmployee(employee1);
        employeeMap.addEmployee(employee2);
        employeeMap.addEmployee(employee3);

        int idToLookup = 102;
        Employee foundEmployee = employeeMap.getEmployeeById(idToLookup);

        if (foundEmployee != null) {
            System.out.println("\nEmployee found with ID " + idToLookup + ": " + foundEmployee);
        } else {
            System.out.println("\nEmployee not found with ID " + idToLookup);
        }

        int idToRemove = 101;
        employeeMap.removeEmployee(idToRemove);

        System.out.println("\nAfter removing Employee with ID " + idToRemove + ":");
        employeeMap.displayAllEmployees();
    }
}
