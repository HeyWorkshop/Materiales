/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.ViewControlItems;
import Vista.ViewCreateItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Alan Sanchez
 */
public class ControllCreate implements ActionListener{
    private ViewCreateItem viewCreate;

    public ControllCreate(ViewCreateItem viewCreate) {
        this.viewCreate = viewCreate;
        
        this.viewCreate.getjButtonCreate().addActionListener(this); //Inicializa el listener del evento del boton
        this.viewCreate.getjButtonCancel().addActionListener(this); //Incializa el listener del evento del boton
        
        initializeCombobox();
        
        this.viewCreate.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == viewCreate.getjButtonCreate()){
            
        }else  if(e.getSource() == viewCreate.getjButtonCancel()){
            viewCreate.dispose();
            ViewControlItems controlItems = new ViewControlItems();
            ControllerItems control = new ControllerItems(controlItems);
        }
    }

    private void initializeCombobox() {
        
    }
    
    
}
