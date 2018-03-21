/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.ViewControlItems;
import Vista.ViewCreateItem;
import Vista.ViewEditItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;

/**
 *
 * @author Alan Sanchez
 */
public class ControllerItems implements ActionListener {

    private ViewControlItems viewControlItems;

    public ControllerItems(ViewControlItems viewControlItems) {
        this.viewControlItems = viewControlItems;
        
        this.viewControlItems.getjButtonCreate().addActionListener(this); //Incializa el listener del evento del boton
        this.viewControlItems.getjButtonDelete().addActionListener(this); //Incializa el listener del evento del boton
        this.viewControlItems.getjButtonEdit().addActionListener(this); //Incializa el listener del evento del boton
        this.viewControlItems.getjButtonExit().addActionListener(this); //Incializa el listener del evento del boton
        
        fillItemsTable(this.viewControlItems.getjTableItems());
        
        this.viewControlItems.setVisible(true);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == viewControlItems.getjButtonCreate()){
            ViewCreateItem createItem = new ViewCreateItem();
            ControllCreate control = new ControllCreate(createItem);
            viewControlItems.dispose();
        }else if(e.getSource() == viewControlItems.getjButtonDelete()){
            
        }else if(e.getSource() == viewControlItems.getjButtonEdit()){
            
            
        }else if(e.getSource() == viewControlItems.getjButtonExit()){
            viewControlItems.dispose();
            System.exit(0);
        }
    }

    private void fillItemsTable(JTable jTableItems) {
        
    }
    
}
