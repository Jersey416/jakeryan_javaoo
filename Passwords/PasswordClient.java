package Passwords;
/**
 * @author jdrya
 */
import java.util.Scanner;
public class PasswordClient {
    //main
    public static void main(String[] args){
        //display program title & acquire password
        String password;
        int strengthNum;
        String strength;
        System.out.println("Password Strength Test");
        System.out.println("Enter password(s): ");
        //req 1 complete
        //for loop so mutiple passwords can be checked before close
        for(int i=1; i>0; i++){
        Scanner in=new Scanner(System.in);
        //scan in password
        password=in.next();
        //strengthChecker & superStrengthChecker objects
        SuperStrengthChecker Strength=new SuperStrengthChecker();
        StrengthChecker Grade= new StrengthChecker();
        //number=getStregth method
        //@param password
        strengthNum=Strength.getStrengthNum(password);
        //strength=Strength.getGrade(strengthNum);
        System.out.println(strengthNum+"/10");
        strength=Grade.getGrade(strengthNum);
        System.out.println(strength);
        System.out.println(" ");
        }//close for
    }//close main
}
/**
*edited after to get strengthNum from SuperStrengthChecker
*/
