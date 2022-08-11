// stopwatchInput.java
// Adam Weibler
// Class to handle input checks for user inputs
// Created: 8/11/22

import java.util.*;
import java.io.*;

public class stopwatchInput {
    public int userInput = 0;

    // Create scanner object
    Scanner input = new Scanner(System.in);

    public int getMenuInput(int topBound, int lowBound) {
		boolean failCheck = false;
		do {
			try {
				userInput = input.nextInt();
				if ((userInput > topBound) || (userInput < lowBound)) throw new IOException("Exceeds Bounds");				
				failCheck = false;
			} catch (Exception e) {
				System.out.print("* ERROR: Please enter a valid input *\nInput: ");
				failCheck = true;
			}
            input.nextLine();
		} while (failCheck);
		return 0;
	}

}