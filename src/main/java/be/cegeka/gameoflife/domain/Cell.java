package be.cegeka.gameoflife.domain;

public class Cell {

    private boolean alive;

    private int totalNumberOfNeighbors = 0;

    private Cell(boolean alive) {
        this.alive = alive;
    }

    public static Cell from(boolean alive) {
        return new Cell(alive);
    }

    public boolean isAlive() {
        return alive;
    }

    public void addNeighbors(int numberOfNeighbors) {
        this.totalNumberOfNeighbors += numberOfNeighbors;
    }

    public int getNumberOfNeighbors() {
        return totalNumberOfNeighbors;
    }
}
