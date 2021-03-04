/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Passwords;

/**
 * @author jdrya
 */
public class SuperStrengthChecker {
    /**
     * this is an attempt to use and array to compute the strength
     */
    //create array
    String[] regexp;
    int strengthNum;
    public int getStrengthNum(String password){
        //initialize and fill array w/ regex
        regexp=new String[15];
        regexp[0]=".*\\d.*\\d.*";
        regexp[1]=".*\\d.*";
        regexp[2]="No Digits";
        regexp[3]=".*\\p{Upper}.*\\p{Upper}.*";
        regexp[4]=".*\\p{Upper}.*";
        regexp[5]="No Uppercase";
        regexp[6]=".*\\p{Lower}.*\\p{Lower}.*";
        regexp[7]=".*\\p{Lower}.*";
        regexp[8]="No Lowercase";
        regexp[9]=".*[!@#$%&.].*[!@#$%&.].*";
        regexp[10]=".*[!@#$%&.].*";
        regexp[11]="No Special Characters";
        regexp[12]=".{7,}";
        regexp[13]=".{4,}";
        regexp[14]="Too Short";
        //for loop. Since there needs to be 2 regex expressions per loop, an
        //equations 3i 3i+1 and 3i+2 will work
        for(int i=0; i<5; i++){
            if(password.matches(regexp[3*i])){
                strengthNum+=2;
            }else{if(password.matches(regexp[3*i+1])){
                strengthNum+=1;
            }else{
                System.out.println(regexp[3*i+2]);
            }}}//close if/else
        return strengthNum;
    }//close getStrengthNum
}
