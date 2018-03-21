/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Alan Sanchez
 */
public class Item {
    private int idItem;
    private String name;
    private int price;
    private int idCat;

    public Item(int idItem, String name, int price,int idCat) {
        this.idItem = idItem;
        this.name = name;
        this.price = price;
        this.idCat = idCat;
    }
    
    public Item(String name, int price, int idCat){
        this.name = name;
        this.price = price;
        this.idCat = idCat;
    }
    
    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }
    
    public int getIdItem() {
        return idItem;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
