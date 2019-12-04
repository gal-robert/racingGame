package org.fasttrackit;

import java.util.Scanner;

public class Game {


    private Track[] tracks = new Track[3];

    public void start() {
        System.out.println("Starting game...");

        initializeTracks();
        displayTracks();

        String vehicleName = getVehicleNameFromUser();
        System.out.println("Name from user: " + vehicleName + "\n");

        int playersNumber = getPlayersNumberFromUser();
        System.out.println("Players number: " + playersNumber + "\n");

    }

    private void initializeTracks() {
        Track track1 = new Track();
        track1.setName("Silverstone");
        track1.setLength(4.2);

        Track track2 = new Track();
        track2.setName("Le Mans");
        track2.setLength(200.6);

        Track track3 = new Track();
        track3.setName("Test Track");
        track3.setLength(51.6);

        tracks[0] = track1;
        tracks[1] = track2;
        tracks[2] = track3;
    }

    private void displayTracks() {
        System.out.println("Available tracks:");

        //classic for loop
        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] != null) {
                System.out.println((i + 1) + ". " + tracks[i].getName() + " - " + tracks[i].getLength() + "km");
            }
        }
    }

    private String getVehicleNameFromUser() {
        System.out.println("Please enter vehicle name");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

    private int getPlayersNumberFromUser() {
        System.out.println("Please enter the number of players");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

}
