import java.util.ArrayList;
import java.util.List;

public class WheelOfFortuneAIGame extends WheelOfFortune{
    List<WheelOfFortunePlayer> playerList;
    public WheelOfFortuneAIGame(){
        playerList = new ArrayList<>();
        playerList.add(new dumbAI());
    }

    public WheelOfFortuneAIGame(WheelOfFortunePlayer player){
        assert player != null : "Player cannot be null";
        playerList = new ArrayList<>();
        playerList.add(player);
    }

    public WheelOfFortuneAIGame(List<WheelOfFortunePlayer> playerList){
        assert playerList != null : "PlayerList cannot be null";
        this.playerList = new ArrayList<>(playerList);
    }



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
        WheelOfFortuneAIGame wofUserGame = new WheelOfFortuneAIGame();
        AllGamesRecord record = wofUserGame.playAll();
        System.out.println(record);  // or call specific functions of record
    }
}
