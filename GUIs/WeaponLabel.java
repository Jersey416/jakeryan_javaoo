/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import javax.swing.JLabel;

/**
 *
 * @author jdrya
 */
public class WeaponLabel extends JLabel{
    
    /**
     * These will simply go above the weapon buttons to label which weapons
     * are which
     * @param column
     * @param row
     * @param text 
     */
    public WeaponLabel(int column, int row, String text){
        this.setVisible(true);
        this.setSize(200, 20);
        this.setLocation(column*250+100, row*200);
        this.setText(text);
    }
    public WeaponLabel(int xCoordinate, int row){
        this.setVisible(true);
        this.setSize(200, 20);
        this.setLocation(xCoordinate, row*200);
    }
}
