/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicles;

/**
 *
 * @author jdrya
 */
public interface Crashable {
    public boolean doesVehicleCrash(int crashPercentage);
    
    public int numberOfInjuries(boolean doesCrash);
    
}
