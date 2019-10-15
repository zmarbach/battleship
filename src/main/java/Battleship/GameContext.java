package Battleship;

import java.util.ArrayList;
import java.util.List;

public class GameContext {
    private final List<Ship> allShips = new ArrayList<>();
    private ShipSquare[][] map = new ShipSquare[8][8];

    public List<Ship> getAllShips() {
        return allShips;
    }

    public List<Ship> setShips() {

        map[0][0] = new ShipSquare(0,0);
        map[0][1]  = new ShipSquare(0, 1);
        map[0][2] = new ShipSquare(0, 2);
        map[0][3] = new ShipSquare(0, 3);
        map[0][4]  = new ShipSquare(0, 4);

        var ship5 = new Ship("ship5", 5, new ArrayList<>());
        ship5.addSquareToShip(map[0][0]);
        ship5.addSquareToShip(map[0][1]);
        ship5.addSquareToShip(map[0][2]);
        ship5.addSquareToShip(map[0][3]);
        ship5.addSquareToShip(map[0][4]);

        map[1][0] = new ShipSquare(1, 0);
        map[1][1] = new ShipSquare(1, 1);
        map[1][2] = new ShipSquare(1, 2);
        map[1][3]= new ShipSquare(1, 3);

        var ship4 = new Ship("ship4", 4, new ArrayList<>());
        ship4.addSquareToShip(map[1][0]);
        ship4.addSquareToShip(map[1][1]);
        ship4.addSquareToShip(map[1][2]);
        ship4.addSquareToShip(map[1][3]);

        map[2][0] = new ShipSquare(2, 0);
        map[2][1] = new ShipSquare(2, 1);
        map[2][2] = new ShipSquare(2, 2);

        var ship3 = new Ship("ship3", 3, new ArrayList<>());
        ship3.addSquareToShip(map[2][0]);
        ship3.addSquareToShip(map[2][1]);
        ship3.addSquareToShip(map[2][2]);

        map[3][0] = new ShipSquare(3, 0);
        map[3][1] = new ShipSquare(3, 1);

        var ship2 = new Ship("ship2", 2, new ArrayList<>());
        ship2.addSquareToShip(map[3][0]);
        ship2.addSquareToShip(map[3][1]);

        allShips.add(ship2);
        allShips.add(ship3);
        allShips.add(ship4);
        allShips.add(ship5);

        return allShips;
    }

    public static boolean checkInput(String[] guessArray) {
        boolean check = false;
        var x = Integer.parseInt(guessArray[0]);
        var y = Integer.parseInt(guessArray[1]);
        if ((x >= 0 && x <= 7) && (y >= 0 && y <= 7)) {
            return true;
        }
        return false;
    }
}

