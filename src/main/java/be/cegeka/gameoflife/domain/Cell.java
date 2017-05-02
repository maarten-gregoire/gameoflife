package be.cegeka.gameoflife.domain;

public class Cell {

    private boolean alive;

    private int totalAmountOfNeighbors = 0;

    private Cell(boolean alive) {
        this.alive = alive;
    }

    public static Cell from(boolean alive) {
        return new Cell(alive);
    }

    public boolean isAlive() {
        return alive;
    }

    public void addNeighbors(int amountOfNeighbors) {
        this.totalAmountOfNeighbors += amountOfNeighbors;
    }

    public int getAmountOfNeighbors() {
        return totalAmountOfNeighbors;
    }
}
