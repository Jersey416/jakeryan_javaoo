/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import javax.swing.JPanel;

/**
 *
 * @author jdrya
 */

public class CorePanel extends JPanel{
    /**
     * this is the panel initially shown to the user; it will contain a number
     * of buttons; when clicked, the state will change to a different
     * panel (SelectionPanel) on which the user will be able to change their
     * weapon.
     */
  
    //Da buttons change da state
    WeaponButton primary = new WeaponButton(0, 0, WeaponButton.WEAPON);
    WeaponButton secondary = new WeaponButton(0, 1, WeaponButton.WEAPON);
    WeaponButton lethal = new WeaponButton(0, 2, WeaponButton.EQUIPMENT);
    WeaponButton tactical = new WeaponButton(1, 2, WeaponButton.EQUIPMENT);
    WeaponButton perk = new WeaponButton(2, 2, WeaponButton.EQUIPMENT);
    
    //Da labels do nothin (but label of course)
    WeaponLabel primaryLabel = new WeaponLabel(0,0,"Primary Weapon:");
    WeaponLabel secondaryLabel = new WeaponLabel(0,1, "Secondary Weapon:");
    WeaponLabel lethalLabel = new WeaponLabel(0,2,"Lethal:");
    WeaponLabel tacticalLabel = new WeaponLabel(1,2,"Tactical:");
    WeaponLabel perkLabel = new WeaponLabel(2,2, "Perk:");
    
    WeaponLabel primaryName = new WeaponLabel(255,0);
    WeaponLabel secondaryName = new WeaponLabel(275,1);
    WeaponLabel lethalName = new WeaponLabel(195,2);
    WeaponLabel tacticalName = new WeaponLabel(455,2);
    WeaponLabel perkName = new WeaponLabel(690,2);
    
    
    CorePanel(){
        
        //ya gotta add em to the panel if ya wanna interact with em
        this.add(primary);
        this.add(secondary);
        this.add(lethal);
        this.add(tactical);
        this.add(perk);
        
        this.add(primaryLabel);
        this.add(secondaryLabel);
        this.add(lethalLabel);
        this.add(tacticalLabel);
        this.add(perkLabel);
        
        this.add(primaryName);
        this.add(secondaryName);
        this.add(lethalName);
        this.add(tacticalName);
        this.add(perkName);
        
        this.setSize(1000,1000);
        this.setLayout(null);
        this.setVisible(true);
    }
}
 
