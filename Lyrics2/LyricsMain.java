/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lyrics2;
/**
 *
 * @author jdrya
 */
public class LyricsMain {
    public static void main(String[] args){
        LyricsMachine2 lm=new LyricsMachine2();
        lm.songLength();
        lm.readLyrics();
        lm.playSong();
    }
}
