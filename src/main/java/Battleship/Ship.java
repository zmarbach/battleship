package Battleship;

import java.util.List;

public class Ship {
    private String name;
    private int size;
    private List<ShipSquare> wholeShip;

    public Ship() {
    }

    public Ship(String name, int size, List<ShipSquare> wholeShip) {
        this.name = name;
        this.size = size;
        this.wholeShip = wholeShip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<ShipSquare> getWholeShip() {
        return wholeShip;
    }

    public void setWholeShip(List<ShipSquare> wholeShip) {
        this.wholeShip = wholeShip;
    }

    public void addSquareToShip (ShipSquare shipSquare) {
        wholeShip.add(shipSquare);
    }

}

