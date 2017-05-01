package be.cegeka.gameoflife;

public class Cell {

    private boolean alive;

    private Cell(boolean alive) {
        this.alive = alive;
    }

    public static Cell from(boolean alive) {
        return new Cell(alive);
    }

    public boolean isAlive() {
        return alive;
    }
}
