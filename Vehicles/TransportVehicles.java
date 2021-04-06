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
public class TransportVehicles {

    //these member variables will extend to other vehicle classes
    private int passengerCount;
    private int maxCapacity;
    private double price;
    private double avgSpeed;
    private double maxFeul;
    private boolean engineOn;
    private String manufacturer;
    private String model;

    public int getMaxCapacity(){
        
        return maxCapacity;
    }
    
    /**
     * 
     * @param seatNumber 
     */
    public void setMaxCapacity(int seatNumber){
        
        if(seatNumber>0){
            maxCapacity=seatNumber;
        }else{
            System.out.println("You cannot ride in a vehicle with " 
                    + seatNumber + " seats!");
        }//close if/else       
    }//close setMaxCap
    
    public int getPassengerCount() {

        return passengerCount;
    }//close getPass#

    /**
     *
     * @param passengersBoarded
     */
    public void setPassengerCount(int passengersBoarded) {
        
        if (passengersBoarded > 0) {
            if(passengersBoarded<=maxCapacity){
            passengerCount = passengersBoarded;
            }else{
                System.out.println("Over max capacity!!");
            }//close nested if/else
        }else{
            passengerCount = 0;
        }//close if/else
    }//close setPass#

    public double getPrice() {

        return price;
    }//close get$$

    /**
     *
     * @param cost
     */
    public void setPrice(double cost) {
        
        if (cost > 0) {
            price = cost;
        }else{
            System.out.println("invalid price");
        }//close if/else
    }//close set$$

    public double getAvgSpeed() {

        return avgSpeed;
    }//close getAvgS

    /**
     *
     * @param mph
     */
    public void setAvgSpeed(double mph) {
        
        if (mph > 0) {
            avgSpeed = mph;
        } else {
            avgSpeed = 0;
        }//close if/else
    }//close setAvgS

    public double getMaxFeul() {
        
        return maxFeul;
    }//close getMaxF

    /**
     *
     * @param tankSize
     */
    public void setMaxFeul(double tankSize) {
        
        if (tankSize > 1) {
            maxFeul = tankSize;
        } else {
            System.out.println("The engine will not work without feul!");
            maxFeul = 0;
        }//close if/else
    }//close setMaxF

    public boolean isEngineOn() {
        
        return engineOn;
    }//close isEngineOn

    /**
     * 
     * @param turnOn 
     */
    public void turnEngineOn(boolean turnOn) {
        
        engineOn = turnOn;
    }//close turnEngineOn

    public String getManufacturer() {

        return manufacturer;
    }//close getManuf

    /**
     * 
     * @param brand 
     */
    public void setManufacturer(String brand) {
        
        manufacturer = brand;
    }//close setManuf

    public String getModel() {

        return model;
    }//close getMod

    /**
     * 
     * @param pModel
     * if I ever put a "p" before a var name it means "parameter"
     */
    public void setModel(String pModel) {
        
        model = pModel;
    }//close setMod
}
