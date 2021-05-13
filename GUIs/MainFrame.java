/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/**
 *
 * @author jdrya
 */
public class MainFrame extends JFrame implements Runnable, ActionListener {
    
    //These are used as arguments
    
    public static final int CLASS = 0;
    public static final int PRIMARY = 1;
    public static final int SECONDARY = 2;
    public static final int LETHAL = 3;
    public static final int TACTICAL = 4;
    public static final int PERK = 5;
    
    //these panels are swapped between in order to choose weapons via ChangeState
    
    CorePanel classPanel= new CorePanel();
    SelectionPanel primaryPanel = new SelectionPanel(PRIMARY);
    SelectionPanel secondaryPanel = new SelectionPanel(SECONDARY);
    SelectionPanel lethalPanel = new SelectionPanel(LETHAL);
    SelectionPanel tacticalPanel = new SelectionPanel(TACTICAL);
    SelectionPanel perkPanel = new SelectionPanel(PERK);
    
    @Override
    public void run(){
        this.setVisible(true);
        this.setMinimumSize(new Dimension(1000, 1000));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBackground(new Color(165,165,165));
        this.setTitle("Create-A-Class");
        this.add(classPanel);
        this.add(primaryPanel);
        this.add(secondaryPanel);
        this.add(lethalPanel);
        this.add(tacticalPanel);
        this.add(perkPanel);
        classPanel.setVisible(true);
        setActionListeners();
    }
    public void setActionListeners(){
        
        //look at the method name, pretty self-explanatory
        
        classPanel.primary.addActionListener(this);
        classPanel.secondary.addActionListener(this);
        classPanel.lethal.addActionListener(this);
        classPanel.tactical.addActionListener(this);
        classPanel.perk.addActionListener(this);
        
        for(int i=0;i<3;i++){
            primaryPanel.weapon[i].addActionListener(this);
            secondaryPanel.weapon[i].addActionListener(this);
            lethalPanel.weapon[i].addActionListener(this);
            tacticalPanel.weapon[i].addActionListener(this);
            perkPanel.weapon[i].addActionListener(this);
        }   
    }
        
    
   /**
    * depending on the argument, this changes the state between the 
    * CorePanel (classPanel) and one of the SelesctionPanels
    * 
    * @param state 
    */
    public void changeState(int state){
        if(state == CLASS){
            classPanel.setVisible(true);
            primaryPanel.setVisible(false);
            secondaryPanel.setVisible(false);
            lethalPanel.setVisible(false);
            tacticalPanel.setVisible(false);
            perkPanel.setVisible(false);
            
        }
        if(state == PRIMARY){
            classPanel.setVisible(false);
            primaryPanel.setVisible(true);
        }
        if(state == SECONDARY){
            classPanel.setVisible(false);
            secondaryPanel.setVisible(true);
        }
        if(state == LETHAL){
            classPanel.setVisible(false);
            lethalPanel.setVisible(true);
        }
        if(state == TACTICAL){
            classPanel.setVisible(false);
            tacticalPanel.setVisible(true);
        }
        if(state == PERK){
            classPanel.setVisible(false);
            perkPanel.setVisible(true);
        }
    }

    /**
     * this actionPerformed method from the ActionListener Interface
     * 
     * @param e 
     */
    
    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<3;i++){
            if(e.getSource()==primaryPanel.weapon[i]){
                changeState(CLASS);
                classPanel.primaryName.setText(primaryPanel.label[i].getText());
                classPanel.primary.setIcon(primaryPanel.weapon[i].getIcon());
            }
            if(e.getSource()==secondaryPanel.weapon[i]){
                changeState(CLASS);
                classPanel.secondaryName.setText(secondaryPanel.label[i].getText());
                classPanel.secondary.setIcon(secondaryPanel.weapon[i].getIcon());
            }
            if(e.getSource()==lethalPanel.weapon[i]){
                changeState(CLASS);
                classPanel.lethalName.setText(lethalPanel.label[i].getText());
                classPanel.lethal.setIcon(lethalPanel.weapon[i].getIcon());
            }
            if(e.getSource()==tacticalPanel.weapon[i]){
                changeState(CLASS);
                classPanel.tacticalName.setText(tacticalPanel.label[i].getText());
                classPanel.tactical.setIcon(tacticalPanel.weapon[i].getIcon());
            }
            if(e.getSource()==perkPanel.weapon[i]){
                changeState(CLASS);
                classPanel.perkName.setText(perkPanel.label[i].getText());
                classPanel.perk.setIcon(perkPanel.weapon[i].getIcon());
            }
        }
        
        if(e.getSource()==classPanel.primary){
            changeState(PRIMARY);  
        }
        
        if(e.getSource()==classPanel.secondary){
            changeState(SECONDARY);  
        }
        if(e.getSource()==classPanel.lethal){
            changeState(LETHAL);  
        }
        if(e.getSource()==classPanel.tactical){
            changeState(TACTICAL);  
        }
        if(e.getSource()==classPanel.perk){
            changeState(PERK);  
        }
        
    }
}