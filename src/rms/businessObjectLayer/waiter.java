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
public class waiter extends employee{

    public waiter(int salary, String name, int age, String address, String DOB, String CNIC) {
        super( salary, name, age, address, DOB, CNIC);
    }
     public void setsalary(){
    this.salary=1000;
    }
}
