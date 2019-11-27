package org.fasttrackit;

import java.util.Scanner;

public class Game {
    public void start() {
        System.out.println("Starting game...");
        String vehicleName = getVehicleNameFromUser();
        System.out.println("Name from user: "+ vehicleName + "\n");

        int playersNumber = getPlayersNumberFromUser();
        System.out.println("Players number: "+ playersNumber + "\n");

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
