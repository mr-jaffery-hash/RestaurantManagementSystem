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
public class Onlinecus extends customer{

    public Onlinecus(String paymenttype, int customerid, String name, int age, String address, String DOB, String CNIC) {
        super(customerid, name, age, address, DOB, CNIC);
        this.paymenttype = paymenttype;
    }
String paymenttype;    
}
