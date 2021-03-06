package org.fasttrackit;

import javax.swing.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {


    private Track[] tracks = new Track[3];
    private List<Vehicle> competitors = new ArrayList<>();
    private boolean winnerNotKnown = true;
    private int competitorsWithoutFuel = 0;

    public void start() throws Exception {
        System.out.println("Starting game...");

        initializeTracks();
        displayTracks();

        Track selectedTrack = getSelectedTrackFromUser();
        System.out.println(selectedTrack.getName());
        initializeCompetitors();

        while (winnerNotKnown && competitorsWithoutFuel < competitors.size()) {
            System.out.println("\nNew Round:");
            playRound(selectedTrack);
        }

//        always executes code at least once.
//        do {
//            System.out.println("\nNew Round:");
//            playRound(selectedTrack);
//        } while (winnerNotKnown && competitorsWithoutFuel < competitors.size());



        }

    private void playRound(Track selectedTrack) {
        //enhanced for
        for (Vehicle vehicle : competitors) {
            System.out.println("It's " + vehicle.getName() + "'s turn.");
            double speed = getAccelerationSpeedFromUser();

            vehicle.accelerate(speed);

            if(vehicle.getFuelLevel() <= 0) competitorsWithoutFuel++;

            if (vehicle.getTraveledDistance() >= selectedTrack.getLength()) {
                System.out.println("The winner is " + vehicle.getName());
                this.winnerNotKnown = false;
                break;
            }
        }
    }

    private double getAccelerationSpeedFromUser() {
        try {
            System.out.println("Please enter acceleration speed: ");
            Scanner accelerationInput = new Scanner(System.in);

            return accelerationInput.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("You have entered an invalid value. Please try again...");
            //recursion
            return getAccelerationSpeedFromUser();
        }
    }

    private Track getSelectedTrackFromUser() throws Exception {
        System.out.println("\nPlease select a track: ");
        Scanner trackInput = new Scanner(System.in);

        try {
            return tracks[trackInput.nextInt() - 1];
        } catch (InputMismatchException e) {
            throw new RuntimeException("You have entered an invalid value");
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new Exception("You have selected a non-existing track");
        } finally {
            System.out.println("Always executed");
        }
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

    private void initializeCompetitors() {
        int playersNumber = getPlayersNumberFromUser();
        System.out.println("Players number: " + playersNumber + "\n");

        for (int i = 1; i <= playersNumber; i++) {
            System.out.println("Adding player: " + i);

            Vehicle vehicle = new Vehicle();
            vehicle.setName(getVehicleNameFromUser());
            vehicle.setFuelLevel(80);
            vehicle.setMileage(ThreadLocalRandom.current().nextDouble(6, 10));
            vehicle.setMaxSpeed(ThreadLocalRandom.current().nextInt(120, 220));

            System.out.println("Vehicle for player: " + vehicle.getName() +
                    " with a mileage of " + vehicle.getMileage() + "%");

            competitors.add(vehicle);
        }
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
