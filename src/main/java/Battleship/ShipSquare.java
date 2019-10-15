package Battleship;

public class ShipSquare {
    private Integer column;
    private Integer row;

    public ShipSquare(Integer column, Integer row) {
        this.column = column;
        this.row = row;
    }

    public ShipSquare() {
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }
}

