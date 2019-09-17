package UI;
// I used a lot of the code from the Basics 4 lecture lab (the SimpleCalculatorStarter)

import java.util.Scanner;

public class Options {
    private Scanner scanner;

    private Options() {
        scanner = new Scanner(System.in);
        processOperations();
    }

    private void processOperations() {
        do {
            System.out.println("Choose which type of file to convert (MIDI, MP3, or WAV):");
            String operation = scanner.nextLine();
            System.out.println("You chose: " + operation);
            System.out.println("Next, choose what you want to know (key, notes, rhythm, and/or tempo):");
            operation = scanner.nextLine();
            System.out.println("The " + operation + " of the piece is ");
            System.out.println("Would you like to know more info or look at a different piece of music?");
            operation = scanner.nextLine();
            if (operation.contains("more info")) {
                break;  // I do not know how to return to a certain point in a loop yet
            }
        }
        while (true);
    }

    public static void main(String[] args) {
        new Options();
    }
}
