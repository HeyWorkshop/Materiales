/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Item;
import Vista.ViewControlItems;
import Vista.ViewEditItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Alan Sanchez
 */
public class ControllEdit implements ActionListener{
    private ViewEditItem viewEdit;
    private Item item;

    public ControllEdit(ViewEditItem viewEdit, Item item) {
        this.viewEdit = viewEdit;
        this.item = item;
        
        this.viewEdit.getjButtonSave().addActionListener(this);
        this.viewEdit.getjButtonCancel().addActionListener(this);
        
        initializeCombobox();
        
        this.viewEdit.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == viewEdit.getjButtonSave()){
            
        }else if(e.getSource() == viewEdit.getjButtonCancel()){
            ViewControlItems viewItems = new ViewControlItems();
            ControllerItems controll = new ControllerItems(viewItems);
            viewEdit.dispose();
        }
    }

    private void initializeCombobox() {
        
    }
    
    
}
