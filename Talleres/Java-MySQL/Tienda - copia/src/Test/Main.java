/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Controlador.ControllerItems;
import Vista.ViewControlItems;

/**
 *
 * @author Alan Sanchez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ViewControlItems view = new ViewControlItems();
        ControllerItems controll = new ControllerItems(view);
    }
    
}
