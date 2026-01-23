public class CityMap extends Map{
    @Override
    public Tile createTile(){
        int n = (int)(Math.random()*3);
        if(n == 0){
            return new RoadTile();
        };
        if(n == 1){
            return new ForestTile();
        }
        return new BuildingTile();
    }
}