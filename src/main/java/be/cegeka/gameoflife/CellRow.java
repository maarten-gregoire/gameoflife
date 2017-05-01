package be.cegeka.gameoflife;

import java.util.ArrayList;
import java.util.List;

public class CellRow {
    private List<Cell> cells = new ArrayList<>();

    private CellRow() {
    }

    public static CellRow from (List<Boolean> cellValues) {
        CellRow cellRow = aCellRow();
        cellValues.forEach(cellValue -> cellRow.cells.add(Cell.from(cellValue)));

        return cellRow;
    }

    private static  CellRow aCellRow(){
        return new CellRow();
    }

    public List<Boolean> getAsBooleans() {
        List<Boolean> booleans = new ArrayList<Boolean>();
        cells.forEach(cell -> booleans.add(cell.isAlive()));

        return booleans;
    }

    public List<Cell> getCells() {
        return cells;
    }
}
