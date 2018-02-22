package fi.academy;

import java.util.Random;

public class Kyselija {
    static int kysymysId;

    public static int randomHaku() {
        Random rnd = new Random();
        kysymysId = rnd.nextInt(3) +1;
        return kysymysId;
    }
    public static int getKysymysId(){
        return kysymysId;
    }
}
