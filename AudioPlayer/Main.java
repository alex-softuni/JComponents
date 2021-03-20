package AudioPlayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);

        File file = new File("C:\\Users\\REBEL\\Desktop\\RUNNING MIX\\ASD.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

        System.out.println("Hello please enter command: ");
        System.out.println("--> P = Play");
        System.out.println("--> S = Pause");
        System.out.println("--> R = Reset");
        System.out.println("--> Q = Quit");

        System.out.println("Enter your command here:");
        String response = scanner.nextLine().toUpperCase();

        boolean isPlaying = false;
        while (!response.equals("Q")) {
            switch (response) {
                case "P":
                    if (isPlaying) {
                        System.out.println("Your song is already being played!");

                    } else {
                        System.out.println("Your song is playing...");
                        clip.start();
                        isPlaying = true;
                    }
                    break;
                case "S":
                    isPlaying = false;
                    System.out.println("Pausing...");
                    clip.stop();
                    break;
                case "R":
                    System.out.println("Resetting...");
                    clip.setMicrosecondPosition(0);
                    break;
                case "Q":
                    clip.close();
                    break;
                default:
                    System.out.println("Unsupported command");
            }
            System.out.println("Enter command here:");
            response = scanner.nextLine().toUpperCase();
        }
        System.out.println("Byeeee!");

    }
}
