package be.cegeka.gameoflife;

import java.util.ArrayList;
import java.util.List;

public class World {
    private List<CellRow> cellRows = new ArrayList<>();

    public static World from(List<List<Boolean>> cellValues) {
        World world = aWorld();
        cellValues.forEach(row ->
                world.cellRows.add(CellRow.from(row))
        );
        return world;
    }

    public List<CellRow> getCellRows() {
        return cellRows;
    }

    private static World aWorld() {
        return new World();
    }
}
