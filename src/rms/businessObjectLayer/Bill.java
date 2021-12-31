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
public class Bill implements IBill{

    
    public Bill(int billno, int amount, boolean status, int discount) {
        this.billno = billno;
        this.amount = amount;
        this.status = status;
        this.discount = discount;
    }
    int billno;
    int amount;
    boolean status;
    int discount;
}
