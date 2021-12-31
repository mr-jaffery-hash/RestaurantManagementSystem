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
public class cheforder {
    

    public void setChefname(String chefname) {
        this.chefname = chefname;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getChefname() {
        return chefname;
    }

    public int getOrderid() {
        return orderid;
    }

    public String getItem() {
        return item;
    }

    public cheforder(String chefname, int orderid, String item) {
        this.chefname = chefname;
        this.orderid = orderid;
        this.item = item;
    }
    String chefname;
    int orderid;
    String item;
    
}
