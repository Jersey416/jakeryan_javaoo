/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import javax.swing.ImageIcon;

/**
 *
 * @author jdrya
 */
public class ImageMaker {
    
    //this is so I do not have to type out this folder location for every image
    
    ImageIcon ii;
            
    public ImageIcon getWeaponImage(String imageName){
        ii= new ImageIcon("C:\\Users\\jdrya\\OneDrive\\Documents\\NetBeans"
                + "Projects\\CIT-130\\src\\main\\java\\GUIs\\" + imageName);
        return ii;
    }
    
}
