package GUIs;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JPanel;
/**
 *
 * @author jdrya
 */
public class SelectionPanel extends JPanel {
    
    //These int values are used in the SelectionPanel constructor
    //They determin what weapons the selection panel will contain
    //you will see the same ones in the MainFrame
    
    public static final int PRIMARY = 1;
    public static final int SECONDARY = 2;
    public static final int LETHAL = 3;
    public static final int TACTICAL = 4;
    public static final int PERK = 5;

    /**
     * These buttons will show a number of weapons the user can select
     * in the SelectionPanel;
     * the selected weapon button will replace the previously clicked button 
     * on the CorePanel to the selected weapon
     */
    WeaponButton[] weapon = new WeaponButton[3];
    
    //PICK YOUR WEAPON!!!
    WeaponLabel[] label = new WeaponLabel[3];
    
    ImageMaker im = new ImageMaker();
    /**
     * this adds the buttons n stuff, and changes the images depending on 
     * what selectionPanel
     * type it is
     * @param type
     */
    
    public SelectionPanel(int type){
        
        weapon[0] = new WeaponButton(0,0, WeaponButton.WEAPON);
        weapon[1] = new WeaponButton(0,1, WeaponButton.WEAPON);
        weapon[2] = new WeaponButton(0,2, WeaponButton.WEAPON);
        
        label[0] = new WeaponLabel(0,0, null);
        label[1] = new WeaponLabel(0,1, null);
        label[2] = new WeaponLabel(0,2, null);
        
        this.setSize(1000, 1000);
        this.setLayout(null);
        this.setVisible(false);
        
        
        if(type==PRIMARY){
            label[0].setText("AK-47");
            label[1].setText("MP5");
            label[2].setText("Kar98k");
            weapon[0].setIcon(im.getWeaponImage("ak47.png"));
            weapon[1].setIcon(im.getWeaponImage("mp5.png"));
            weapon[2].setIcon(im.getWeaponImage("kar98k.png"));
        }
        if(type==SECONDARY){
            label[0].setText("1911");
            label[1].setText("Brownington 12GA");
            label[2].setText("RPG-7");
            weapon[0].setIcon(im.getWeaponImage("1911.png"));
            weapon[1].setIcon(im.getWeaponImage("shotgun.png"));
            weapon[2].setIcon(im.getWeaponImage("rpg.png"));
        }
        if(type==LETHAL){
            label[0].setText("Grenade");
            label[1].setText("C4");
            label[2].setText("Throwing Knife");
            weapon[0].setIcon(im.getWeaponImage("frag.png"));
            weapon[1].setIcon(im.getWeaponImage("c4.png"));
            weapon[2].setIcon(im.getWeaponImage("throwingknife.png"));
        }
        if(type==TACTICAL){
            label[0].setText("Flashbang");
            label[1].setText("Heartbeat Sensor");
            label[2].setText("Stimshot");
            weapon[0].setIcon(im.getWeaponImage("flashbang.png"));
            weapon[1].setIcon(im.getWeaponImage("heartbeatsensor.png"));
            weapon[2].setIcon(im.getWeaponImage("stimshot.png"));
        }
        if(type==PERK){
            label[0].setText("Scavenger");
            label[1].setText("Fast Hands");
            label[2].setText("Hardline");
            weapon[0].setIcon(im.getWeaponImage("scavenger.png"));
            weapon[1].setIcon(im.getWeaponImage("fasthands.png"));
            weapon[2].setIcon(im.getWeaponImage("hardline.png"));
        }
        
        //ya gotta add em to the panel if ya wanna interact with em
        for(int i=0; i<3; i++){
            this.add(weapon[i]);
            this.add(label[i]);
        }
        
        
    }
}
