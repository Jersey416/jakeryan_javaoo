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
public class Bus extends TransportVehicles implements Crashable{

    private int numberOfStops;
    private String operatingCompany;
    private String busDriverName;
    private boolean thankTheBusDriver;
    private boolean isDoubleDecker;
    
    /**
     * 
     * @param stops 
     */
    public void setNumberOfStops(int stops){
        
        if(stops>1){
            numberOfStops=stops;
        }
    }
    
    public int getNumberOfStops(){
        
        return numberOfStops;
    }
    
    /**
     * 
     * @param busCompany 
     */
    public void setOperatingCompany(String busCompany){
        
        operatingCompany=busCompany;
    }
    
    public String getOperatingCompany(){
        
        return operatingCompany;
    }
    
    /**
     * 
     * @param name 
     */
    public void setBusDriverName(String name){
        
        busDriverName=name;
    }
    
    public String getBusDriverName(){
        
        return busDriverName;
    }
    
    public void setIsDoubleDecker(boolean twoLevels){
        
        isDoubleDecker=twoLevels;
    }
    
    public boolean getIsDoubleDecker(){
        
        return isDoubleDecker;
    }
    
    /**
     * 
     * @param thank 
     */
    public void willYouThankTheBusDriver(boolean thank){
        
        if(!thank){
            System.out.println("Why didn't you thank the bus driver!?");
        }
        thankTheBusDriver=thank;
    }
    
    public boolean didYouThankTheBusDriver(){
        
        return thankTheBusDriver;
    }
    
    private int randNum;
    private int injuries;
    private boolean crashes;
            
    //see if vehicle crashes based on liklihood
    @Override
    public boolean doesVehicleCrash(int crashPercentage) {
        randNum=new Random().nextInt(100);
        if(randNum<=crashPercentage){
            crashes=true;
        }
        return crashes;
    }

    //if it does crash, how many injuries
    /**
     * 
     * @param doesCrash
     * @return
     * recommended: using boolean method doesVehicleCrash() as argument
     */
    @Override
    public int numberOfInjuries(boolean doesCrash) {
        
        //since injuries in busses are much less likely, the number of injuries
        //  will be lowered
        if(doesCrash){
            if(this.getPassengerCount()>6){
                injuries=new Random().nextInt((this.getPassengerCount())-5);
            } else {
                injuries=0;
            }
        } else {
            injuries=0;
        }
        return injuries;
    }
    
}
