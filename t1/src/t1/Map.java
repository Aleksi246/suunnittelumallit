package t1;

public abstract class Map extends Game{
    protected Tile[][] tiles;

    public Map(){
        tiles = new Tile[10][10];
        generateMap();
    }

    
    protected abstract Tile createTile();

    private void generateMap() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tiles[i][j] = createTile();
            }
        }
    }

    public void display() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tiles[i][j].getCharacter() + " ");
            }
            System.out.println();
        }
    }
}
