package fi.academy;

import java.util.Random;

public class Kyselija {

    public static int randomHaku() {
        Random rnd = new Random();
        int kysymysId = rnd.nextInt(3) +1;
        return kysymysId;
    }
}
