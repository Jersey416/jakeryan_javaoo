/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicles;
import java.util.Scanner;
/**
 *
 * @author jdrya
 */
public class UberSimulator {

    public static void main(String[] args) {
        /**
         * Lets make an Uber
         */
        Uber uberCar = new Uber();
        //how many passengers?
        //how far do you need this uber to take you?
        Scanner userIn=new Scanner(System.in);
        //set the setters from sub class:
        uberCar.setDriverKindness(true);
        uberCar.setDriverName("Paul");
        uberCar.setDriverRating(4);
        uberCar.setRefreshments(false);
        uberCar.setSmell("new car");
        //set the setters from super class
        uberCar.setPrice(1.75);
        uberCar.setManufacturer("NISSAN");
        uberCar.setModel("Altima");
        uberCar.setMaxCapacity(3);
        uberCar.setMaxFeul(15.0);
        uberCar.setAvgSpeed(35);
        uberCar.turnEngineOn(true);
        //get some user interaction: distance and
        System.out.printf("This driver's name is " + uberCar.getDriverName() 
                    + ".\nThey drive a " + uberCar.getManufacturer() + " " 
                    + uberCar.getModel() + ".\nThey have a Driver Rating of "
                    + uberCar.getDriverRating() + ".\nTheir cost per mile "
                    + "is $" + uberCar.getPrice() + "\n");
        System.out.println("Enter number of passengers: ");
        uberCar.setPassengerCount(userIn.nextInt());
        System.out.println("Enter the distance needed (mi): ");
        uberCar.setPrice(userIn.nextDouble()*uberCar.getPrice());
        //use this string to turn booleans into strings
        String wasKind;
        String wasRefreshments;
        if(uberCar.isDriverKind()==true){
            wasKind = "was";
        }else{
            wasKind= "was not";
        }
        if(uberCar.getRefreshments()==true){
            wasRefreshments = "were";
        }else{
            wasRefreshments="were not";
        }
        //use the getters to simulate 
        if(uberCar.isEngineOn()==false){
            System.out.println("the engine is off!!");
        }else{
            System.out.printf(uberCar.getDriverName() + " " + wasKind + " kind."
                    + "\nThey drove about " + uberCar.getAvgSpeed() + " mph."
                    + "\nTheir car had a " + uberCar.getSmell() + " smell."
                    + "\nThere "+ wasRefreshments + " refreshemnts."
                    + "\nThere were " +
                    uberCar.numberOfInjuries(uberCar.doesVehicleCrash(2))
                    + " injuries.");
        }//close if/else
    }//close main
}
