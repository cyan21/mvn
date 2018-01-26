package org.ych;

public class Greeting {

    public Greeting() {
    }

    public static String en() {
        return "Hello";
    }

    public static String fr() {
        return "Salut";
    }

    public static String sp() {
        return "Hola";
    }

    public static void main(String[] args) {
	Greeting g = new Greeting();
        System.out.println("french guy says " + g.fr());
        System.out.println("spanish guy says " + g.sp());
        System.out.println("english guy says " + g.en());
    }
}
