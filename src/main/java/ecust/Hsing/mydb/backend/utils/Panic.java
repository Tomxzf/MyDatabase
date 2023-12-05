package ecust.Hsing.mydb.backend.utils;

import javax.sound.midi.SysexMessage;

public class Panic {
    public static void panic(Exception err) {
        err.printStackTrace();
        System.exit(1);


    }
}
