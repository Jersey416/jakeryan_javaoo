package Passwords;
/**
 *
 * @author jdrya
 */
public class RegExpression {
    public static void main(String[] args){
        /*reg expression: see if string x matches or does not match given
        regular expression. see if there are certain chars/ patterns*/
        /*the "matches" String object sees if an expression matches a phrase
        or section of phrase*/
        //boolean compares something
        String wordd = "Java1sC001";
        String regExp = ".*\\d*.*";
        /*
        *many different ways to detect different items using the matches method
        *    \\s for spaces;     . means any character; 
        *    * repeater meaning 0 or more times; + repeater for 1 or more times; 
        *    \\d{x} is any digit(s) 1-9 where x is the number of digits;
        *    \\d is a digit 0-9; \\n end of a line;   \\D any non-digit
        *    [string] where string is any character(s)
        * \n and \s are expressions in programming adding a second backslash
        * like in \\n and \\s tells computer it is using \n or \s in a 
        * regular expression.
        */
        if(wordd.matches(regExp)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }//close if/else
    }//close main
}
