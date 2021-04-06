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
public class BusSimulator {
    public static void main(String[] args){
        Bus publicBus = new Bus();
        //set setters from sub class
        publicBus.setBusDriverName("Reginald");
        publicBus.setOperatingCompany("Charters of America");
        publicBus.setNumberOfStops(14);
        publicBus.setIsDoubleDecker(false);
        publicBus.willYouThankTheBusDriver(false);
        //set the setters from super class
        publicBus.setPrice(2.00);
        publicBus.setManufacturer("Volvo Buses");
        publicBus.setModel("B8L");
        publicBus.setMaxCapacity(80);
        publicBus.setMaxFeul(30.5);
        publicBus.setAvgSpeed(25);
        publicBus.turnEngineOn(true);
        publicBus.setPassengerCount(27);
        
        //use getters to simulate:
        System.out.println("The bus driver, "+  publicBus.getBusDriverName()
                + " drives a "+ publicBus.getModel()+ " for "
                + publicBus.getOperatingCompany() + "\nIt costs $"
                + publicBus.getPrice() + " to ride and stops at "
                + publicBus.getNumberOfStops() + " different places."
                + "\nThere are currently "+ publicBus.getPassengerCount()
                + " passengers on the bus.");
        System.out.println("There were "
                + publicBus.numberOfInjuries(publicBus.doesVehicleCrash(1))
                +" injuries.");
    }
}
