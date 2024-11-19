public class Main {
    public static void main(String[] args) {
        Player player = new Player("Betül Salim", 1);
        player.Login();
        player.show();
        System.out.println("Player: " + player.playerId + " " + player.playerName);
        // Static Metodlar Nesne üretmeye ihtiyaç olmadan hafızada yer kaplar
        System.out.println("Game Name: " + player.gameName);

    }
}
