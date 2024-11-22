package Static;

public class Player {
    public String playerName;
    public int playerId;
    public static String gameName = "CS";
    public static int score = 0;

    public Player(String playerName, int playerId) {
        this.playerName = playerName;
        this.playerId = playerId;
        //score++;
    }

    public void Login(){
        score++;
    }

    public static void show(){
        Player p = new Player("Burak Salim", 1);
        System.out.println(p.playerName);
    }
}
