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
public class manager extends employee{

    public manager(int experience, int EmployeeID, int salary, String Grade, String name, int age, String address, String DOB, String CNIC) {
        super(EmployeeID, salary, Grade, name, age, address, DOB, CNIC);
        this.experience = experience;
    }
    int experience;
}
