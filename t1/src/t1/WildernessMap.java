package t1;

public class WildernessMap extends Map{
    @Override
    public Tile createTile(){
        int n = (int)(Math.random()*3);
        if(n == 0){
            return new SwampTile();
        };
        if(n == 1){
            return new WaterTile();
        }
        return new ForestTile();
    }
}