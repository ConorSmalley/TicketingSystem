package ticketing.system;

import java.util.ArrayList;
import java.util.List;

/**
 * A collection class for employees.<p> Also handles management of employees.
 */
public class EmployeeAccountManager {

    private static EmployeeAccountManager empAccMgr = null;
    private List<Employee> employees;

    private EmployeeAccountManager() {
        employees = new ArrayList();
    }

    public static EmployeeAccountManager getInstance() {
        if (empAccMgr == null) {
            empAccMgr = new EmployeeAccountManager();
        }
        return empAccMgr;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public Employee getEmployeeById(int id) {
//        return null;
        for (Employee e : employees) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }
}
