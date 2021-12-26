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
public class Walkin_cus extends customer{

    public Walkin_cus(int noofpersons, boolean family, int customerid, String name, int age, String address, String DOB, String CNIC) {
        super(customerid, name, age, address, DOB, CNIC);
        this.noofpersons = noofpersons;
        this.family = family;
    }
int noofpersons;
boolean family;
}
