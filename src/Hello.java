package src;

import java.util.Scanner;

public class Hello {

    public static void main (String[] args) {

	String name;
	Scanner kb = new Scanner(System.in);

	//Requesting and setting name.

	System.out.println("What is your name?");
	name = kb.nextLine();

	System.out.println("Hello " + name + "!");

    }

}
