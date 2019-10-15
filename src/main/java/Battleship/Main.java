package Battleship;

import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        GameContext gameContext = new GameContext();
        var allShips = gameContext.setShips();
        System.out.println("Let the game begin. This is battleship with a 8x8 grid. ");
        System.out.println("Make a guess using the following syntax: 'column#, row#'. For example, '1,7' would guess column 1, row 7.");
        System.out.println("Type 'map' to see record of your previous guesses.");
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);
        var hitMissMap = new HashMap<>();

        boolean loop = true;
        while (true) {

            System.out.print("Enter guess here: ");

            var guess = scanner.nextLine();
            var guessArray = guess.trim().split(",");

            if (guess.equalsIgnoreCase("map")) {
                System.out.println("Previous guesses: " + "\n" + hitMissMap.toString());
            } else if (guess.trim().split(",").length == 1) {
                System.out.println("Sorry, invalid guess");
            } else {

                int pathHelper = 1;
                if (GameContext.checkInput(guessArray) == false) {
                    System.out.println("Sorry, invalid guess.");
                    pathHelper = 0;
                }
                var shipsToRemove = new ArrayList<>();
                for (Ship s : allShips) {
                    List<ShipSquare> allShipSquares = s.getWholeShip();
                    List<ShipSquare> shipSquaresToRemove = new ArrayList<>();
                    for (ShipSquare ss : s.getWholeShip()) {
                        if (ss.getColumn().toString().equals(guessArray[0]) && ss.getRow().toString().equals(guessArray[1])) {
                            String value = "hit";
                            System.out.println(value);
                            hitMissMap.put(guess, value);
                            pathHelper = 0;
                            shipSquaresToRemove.add(ss);
                        }
                    }
                    allShipSquares.removeAll(shipSquaresToRemove);
                    if (s.getWholeShip().isEmpty()) {
                        System.out.println("You sunk " + s.getName());
                        shipsToRemove.add(s);
                    }
                }
                allShips.removeAll(shipsToRemove);

                if (pathHelper == 1) {
                    String value = "miss";
                    System.out.println(value);
                    hitMissMap.put(guess, value);
                }
            }
            if (allShips.isEmpty()) {
                System.out.println("Congrats! You sunk all ships and won the game!");
                loop = false;
                return;
            }
        }
    }


}
