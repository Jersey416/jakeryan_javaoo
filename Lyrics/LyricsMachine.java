
package Lyrics;
import java.util.Scanner;
public class LyricsMachine {
    //create needed variables
    String[][] verse;
    String songTitle;
    String artist;
    int year;
    /**
     * public method that will not return value. Used to initialize Array
     * @param linesPerVerse
     * @param amountVerses 
     */
    public void initializeArray(int linesPerVerse, int amountVerses){
        //first is max lines per verse, next is the amount of verses there are
        if(linesPerVerse>0 && amountVerses>0){
        verse = new String[linesPerVerse][amountVerses];
        System.out.println("Verse array has " + verse[0].length + " stanzas");
        System.out.println("and each stanza has "+ verse.length +" lines");
        }else{
            System.out.println("Please enter numbers greater than 0");
        }//close if/else
    }//close initArray
    //method that reads lyrics
    public void readLyrics(){
        Scanner lyricLine = new Scanner(System.in);
        for(int line=0; line<verse.length; line++){
            
        }
    }
}
