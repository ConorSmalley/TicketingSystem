/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing.system;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Curtis
 */
public class EmployeeAccountManager {
    private List<Employee> employees = new ArrayList();
    
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    
    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }
    
    public Employee getEmployeeById (int id) {
        return null;
    }
}