package org.ych;


public class Human implements Living {

    public Human() {
    }

    public static String says() {
        return Greeting.en();
    }

    public boolean canTalk() {
     	return true;
    }

}
