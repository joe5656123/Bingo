public class Bingo {
    private static BingoGame game;

    public static void main(String[] args) {
        game = new BingoGame();
    }
    
    public static BingoGame getGame() {
        return game;
    }
}
