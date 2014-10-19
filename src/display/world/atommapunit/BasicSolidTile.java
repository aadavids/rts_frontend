package ca.josh.display.world.atommapunit;

public class BasicSolidTile extends BasicTile {

    public BasicSolidTile(int id, int x, int y, int tileColour, int levelColour) {
        super(id, x, y, tileColour, levelColour);
        this.solid = true;
    }

}
