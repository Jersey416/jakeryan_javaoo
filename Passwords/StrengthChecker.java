package Passwords;
/**
 *req- 1: enter pass 2: detect character types 3: number of each type
 *4: calculate strength
 *give password to machine that checks strength
 * @author jdrya
 * 2 points per category: digits, uppercase, lowercase, special, and length
 * rating x/10 Grade too weak: 0-2 weak: 3-5 strong:6-8 very strong:9-10
 */
public class StrengthChecker {
    //check candidate for a certain character
    //detect using reg. exp.
    /**
     * @param password
     * @return 
     */
    public int getStrengthNum(String password){
        int strengthNum=0;
        //see if there are digits
        if(password.matches(".*\\d.*\\d.*")){
        //the seperate \\d's makes sure there is at least 2 digits anywhere
            strengthNum=strengthNum+2;
        }else{if(password.matches(".*\\d.*")){
            strengthNum=strengthNum+1;    
        }else{System.out.println("No Numbers");
        }}//close nested if/else
        //see if there are uppercase
        if(password.matches(".*\\p{Upper}.*\\p{Upper}.*")){
            strengthNum=strengthNum+2;
        }else{if(password.matches(".*\\p{Upper}.*")){
            strengthNum+=1;
        }else{
            System.out.println("No Uppercase letters");
        }}//close nested if/else
        //see if there are lowercase
        if(password.matches(".*\\p{Lower}.*\\p{Lower}.*")){
            strengthNum=strengthNum+2;
        }else{if(password.matches(".*\\p{Lower}.*")){
            strengthNum+=1;
        }else{
            System.out.println("No Lowercase letters");
        }}//close nested if/else
        //see if there are special characters
        if(password.matches(".*[!@#$%&.].*[!@#$%&.].*")){
            strengthNum=strengthNum+2;
        }else{if(password.matches(".*[!@#$%&.].*")){
            strengthNum+=1;
        }else{
            System.out.println("No Special Characters (!@#$%&.)");
        }}//close nested if/else
        //check length
        if(password.matches(".{7,}")){
            strengthNum=strengthNum+2;
        }else{if(password.matches(".{4,}")){
            strengthNum+=1;
        }else{
            System.out.println("Too Short");
        }}//close nested if/else
            return strengthNum;
    }//close getStrengthNum
    /**
    *completed req 2: detect characters by type
    *completed req 3: detect amount of each type
    *completed req 4: calculate strength
    *additionally checked length & upper/lower letters
    */
    /**
     * I know that I could have used an array and a loop to make this process
     * simpler but I do not have the skills to do so yet.
     * @param strengthNum
     * @return 
     */
    public String getGrade(int strengthNum){
        //finds value of strengthNum and determines grade
        String Grade = null;
        if(strengthNum>=9){
            Grade="Very Strong";
        }else{if(strengthNum>=6){
            Grade="Strong";
        }else{if(strengthNum>=3){
            Grade="Weak";
        }else{if(strengthNum>=1){
            Grade="Too Weak";
        }}}}//close if/else
        return Grade;
    }//close getGrade
}//close class
       
        


