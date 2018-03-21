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
public class Category {
    private int idCat;
    private String nameCat;

    public Category(int idCat, String nameCat) {
        this.idCat = idCat;
        this.nameCat = nameCat;
    }
    
    public int getIdCat() {
        return idCat;
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }
    
    
}
