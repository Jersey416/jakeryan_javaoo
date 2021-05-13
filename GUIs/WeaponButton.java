/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

/**
 *
 * @author jdrya
 */
public class WeaponButton extends JButton implements MouseListener{
    
    public static final int WEAPON = 0;
    public static final int EQUIPMENT = 1;
    
    /**
     * These buttons are going to be used to change weapons in the load out;
     * This will set size depending on value entered and makes these buttons 
     * easy to use, especially since they all have similar sizes and locations
     * @param column
     * @param row
     * @param shape
     */
    public WeaponButton(int column, int row, int shape) {
        this.setVisible(true);
        this.setBackground(new Color(125,125,125));
        this.setBorder(new LineBorder(Color.black));
        this.setMargin(null);
        
        if(shape == WEAPON){
            this.setSize(400,150);
            this.setLocation(100, row*200+20);  
            this.addMouseListener(this);
        }
        if(shape == EQUIPMENT){
            this.setSize(200, 150);
            this.setLocation(column*250+100, row*200+20); 
        }
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
        this.setBackground(new Color(75,75,75));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBackground(new Color(125,125,125));
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
