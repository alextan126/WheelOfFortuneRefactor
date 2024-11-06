public class WheelOfFortuneUserGame extends WheelOfFortune{
    @Override
    public void getGuess(String previousGuesses) {

    }

    @Override
    public GameRecord play() {
        return null;
    }

    @Override
    public boolean playNext() {
        return false;
    }

    public static void main(String [] args) {
        WheelOfFortuneUserGame wheelOfFortuneUserGame = new WheelOfFortuneUserGame();
        AllGamesRecord record = wheelOfFortuneUserGame.playAll();
        System.out.println(record);  // or call specific functions of record
    }
}
