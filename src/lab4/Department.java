/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.*;
/**
 *
 * @author pdavis13
 */
public class Department {
    private ArrayList<Employee> employee;
    
    public void meetDepartment(Employee employee){
        employee.setMetDeptStaff(true);
    }
    
    public void reviewPolicies(Employee employee){
        employee.setReviewedDeptPolicies(true);
    }
}
