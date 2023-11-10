package jaramillo.Ch4;

public class TestPlayer{
    public static void main(String[] args){
        BaseballPlayer aCatcher = new BaseballPlayer(12, .218);
        BaseballPlayer aShorstop = new BaseballPlayer(31, .385);
        aCatcher.showPlayer();
        aShorstop.showPlayer();
        BaseballPlayer anOutfielder = new BaseballPlayer(44, .505);
        anOutfielder.showPlayer();
        aCatcher.showPlayer();
    }
}