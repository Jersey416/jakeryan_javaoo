/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicles;
import java.util.Random;
/**
 *
 * @author jdrya
 */
public class Uber extends TransportVehicles implements Crashable{

    private int driverRating;
    private String driverName;
    private String smell;
    private boolean refreshments;
    private boolean kindDriver;

    public int getDriverRating() {

        return driverRating;
    }//close getDRate

    /**
     *
     * @param rating
     */
    public void setDriverRating(int rating) {
        
        if (rating >= 1 && rating <= 5) {
            driverRating = rating;
        } else {
            System.out.println("rating must be between 1-5");
        }
    }//close SetDRate

    public String getDriverName() {

        return driverName;
    }//close getDriverName

    /**
     * 
     * @param name 
     */
    public void setDriverName(String name) {
        
        driverName = name;
    }//close setDriverName

    public String getSmell() {

        return smell;
    }//close getSm

    /**
     *
     * @param scent
     */
    public void setSmell(String scent) {
        
        smell = scent;
    }//close setSm

    public boolean getRefreshments() {

        return refreshments;
    }//close getSnack  

    /**
     *
     * @param snacks
     */
    public void setRefreshments(boolean snacks) {

        refreshments = snacks;
    }//close setSnacks

    public boolean isDriverKind() {

        return kindDriver;
    }//close isDriverKind

    /**
     *
     * @param kind
     */
    public void setDriverKindness(boolean kind) {

        kindDriver = kind;
    }//close 

    //these values are for the return statements of the interface methods
    private boolean vehicleCrashes;
    private int injuries;
    private int randNum;
    
    @Override
    public boolean doesVehicleCrash(int crashPercentage) {
        
        randNum = new Random().nextInt(100);
        System.out.println(randNum);
        vehicleCrashes = (randNum<=crashPercentage);
        return vehicleCrashes;
    }//close doesVehicleCrash
    
    /**
     * 
     * @param doesCrash
     * recommended: using boolean method doesVehicleCrash() as argument
     */
    @Override
    public int numberOfInjuries(boolean doesCrash) {
        
        if(doesCrash){
            if(this.getPassengerCount()==0){
                System.out.println("No passengers. No one is injured (except "
                        + "maybe the driver)");
            }else{
                injuries=new Random().nextInt(this.getPassengerCount()+1);
            }
        }else{
            injuries =0;
            System.out.println("Arrived Safely!");
        }
        return injuries;
    }//close numOfInj
}
