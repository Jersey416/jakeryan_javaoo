package Lyrics2;
import java.util.Scanner;
/**
 *
 * @author jdrya
 */
public class LyricsMachine2 {
    //create variables needed for the lyrics machine to run
    int stanzas;
    int linesPerStanza;
    String title;
    String author;
    String[][] song;
    public void songLength(){
        //prompt user to input info
        Scanner in=new Scanner(System.in);
        System.out.println("Enter song title:");
        //read in song info
        title=in.nextLine();
        System.out.println("Enter song author:");
        author=in.nextLine();
        System.out.println("How many stanzas are in the song?");
        stanzas=in.nextInt();
        System.out.println("Max lines in one stanza?");
        linesPerStanza=in.nextInt();
        song=new String[linesPerStanza][stanzas];
    }//close songLength
    public void readLyrics(){
        //create mothod that will read lyric input
        //create scanner
        Scanner in=new Scanner(System.in);
        //prompt
        System.out.println("Please type in lyrics. When done with line,");
        System.out.println("press enter. If there are no more line in stanza, hit enter until on next stnaza");
        //for() loop that increases by 1 line after enter key is hit
        //after for() loop for each line ends, it goes to next stanza
        for(int s=0; s<stanzas; s++){
            for(int l=0; l<linesPerStanza; l++){
                song[l][s]=in.nextLine();
            }//close for
        }//close for
    }//close readLyrics
    public void playSong(){
        //adds spaces
        System.out.println(" ");
        System.out.println(" ");
        //display title/author
        System.out.println(title);
        System.out.println("By: "+ author);
        System.out.println(" ");
        //for loops display lyrics
        for(int s=0; s<stanzas; s++){
            for(int l=0; l<linesPerStanza; l++){
                System.out.println(song[l][s]);
            }//close for
            //space after each stanza
            System.out.println(" ");
        }
    }
}
