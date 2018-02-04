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

    public static void main(String[] args) throws InterruptedException { 

	Greeting g = new Greeting();
	int cnt = 0, max = 100, tmp = 0, sleep_time = 5000;
	
	for (;;) {

        	System.out.println("french guy says " + g.fr());
		Thread.sleep(sleep_time);

	        System.out.println("spanish guy says " + g.sp());
		Thread.sleep(sleep_time);

       		System.out.println("english guy says " + g.en());
		Thread.sleep(sleep_time);

		if (cnt == max ) {
			tmp = max - cnt;	
        		System.out.println("I'm done, bye");
			break;
		} else 
			cnt++;
	
	}
	
    }
}
