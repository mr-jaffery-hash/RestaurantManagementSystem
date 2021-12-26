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
public class Menu {
    String Items[];

    public Menu(String[] Items, int[] pricelist, int[] preptime) {
        this.Items = Items;
        this.pricelist = pricelist;
        this.preptime = preptime;
    }
    int pricelist[];
    int preptime[];
    
}
