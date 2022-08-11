// stopwatchMenu.java
// Adam Weibler
// Store all menu screens throughout the program
// Created: 8/11/22

public class stopwatchMenu {
    private static void frame (int num, boolean newLine) {
		for (int i = 1; i <= num; i ++){
		    System.out.print ('-');
		} if (newLine) System.out.print("\n");
    }

    public void startScreen () {
        frame(35, true);
        System.out.print("|            Stopwatch            |\n");
        frame(35,true);
        System.out.print("|Enter (1) to start stopwatch     |\n" +
						 "|Enter (2) to view saved sessions |\n" +
						 "|Enter (3) to exit                |\n");
		frame(35, true);
		System.out.print("Input: ");
    }

    public void stopwatchScreen () {
        frame(10, true);
        System.out.print("|Start Time: |\n" +
                         "|Current Time: \n");
        frame(10,true);
        System.out.print("|Enter (1) to enter a lap |\n" +
                         "|Enter (2) to stop        |\n");
        frame(10,true);

    }
}
