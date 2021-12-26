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
public class Order {
    int orderno;
    String ordereditems[];

    public Order(int orderno, String[] ordereditems) {
        this.orderno = orderno;
        this.ordereditems = ordereditems;
    }

}
