/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rms.businessObjectLayer;

/**
 *
 * @author Lenovo
 */
public class employee extends Person{

    public employee(int EmployeeID, int salary, String Grade, String name, int age, String address, String DOB, String CNIC) {
        super(name, age, address, DOB, CNIC);
        this.EmployeeID = EmployeeID;
        this.salary = salary;
        this.Grade = Grade;
    }
    int EmployeeID;
    int salary;
    String Grade;
    
}
