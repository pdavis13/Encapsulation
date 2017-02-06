/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;

/**
 *
 * @author pdavis13
 */
public class HumanResources extends Department{
    
    public HumanResources(){
        super("Human Resources");
    }
    
    public void hireEmployee(String firstName, String lastName, String ssn, Department department){
        Employee e = new Employee(firstName, lastName, ssn, department);
        department.gainEmployee(e);
        e.doFirstTimeOrientation("A" + (int)(Math.random()*1000));
        e.getReportService().outputReport();
    }
}
