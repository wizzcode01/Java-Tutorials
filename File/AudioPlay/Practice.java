package File.AudioPlay;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Practice {
    public static void main(String[] args) {
        String filePath = "File\\AudioPlay\\3dabrar-funny-alarm-317531.mp3";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(System.in);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();

            clip.open(audioStream);

            String response = "";

            while (response.equals(response)) {
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");

                System.out.print("Enter your choice: ");
                response = scanner.next().toUpperCase();

                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.stop();
                    default -> System.out.println("Invalid choice");
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        } catch (UnsupportedAudioFileException e) {
            System.out.println();
        } catch (IOException e) {
            System.out.println("Something went wrong");
        } catch (LineUnavailableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            System.out.println("Bye");
        }
    }
}
