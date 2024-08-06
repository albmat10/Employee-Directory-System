import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {
    private Map<Integer, Employee> employeeMap;

    public EmployeeMap() {
        employeeMap = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
    }

    public Employee getEmployeeById(int id) {
        return employeeMap.get(id);
    }

    public void removeEmployee(int id) {
        employeeMap.remove(id);
    }

    public void displayAllEmployees() {
        for (Employee employee : employeeMap.values()) {
            System.out.println(employee);
        }
    }
}
