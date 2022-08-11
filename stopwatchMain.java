// stopwatchMain.java
// Adam Weibler
// Java assignment to create a stopwatch
// Created: 8/11/2022

public class stopwatchMain 
{
  public static void main(String[] args) throws Exception {
    boolean stopwatchPRRepeat = true;

    // Implement organization class
    organization org = new organization();

    // Implement stopwatchMenu class
    stopwatchMenu sWMenu = new stopwatchMenu();

    // Implement stopwatchInput class
    stopwatchInput sWInput = new stopwatchInput();

    do {
      org.ClearScreen();
      System.out.println(" DEBUG:: Running 'stopwatchMain.java' ");
      sWMenu.startScreen();
      sWInput.getMenuInput(3,1);
      switch(sWInput.userInput) {
        case 1:
        System.out.println(" DEBUG:: User chose option 1 ");
        break;

        case 2:
        System.out.println(" DEBUG:: User chose option 2 ");
        break;
        
        case 3:
        System.out.println("* User chose to exit the program *\n");
        stopwatchPRRepeat = false;
        break;
      }
    } while (stopwatchPRRepeat);
  }
}
