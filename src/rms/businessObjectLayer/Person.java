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
public class Person {

    public Person(String name, int age, String address, String DOB, String CNIC) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.DOB = DOB;
        this.CNIC = CNIC;
    }
    String name;
    int age;
    String address;
    String DOB;
    String CNIC;
}
