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
public class Table {

    public Table(int Tableid, int seatingcap, String tabletype, boolean vacant) {
        this.Tableid = Tableid;
        this.seatingcap = seatingcap;
        this.tabletype = tabletype;
        this.vacant = vacant;
    }
    int Tableid;
    int seatingcap;
    String tabletype;
    boolean vacant;
}
