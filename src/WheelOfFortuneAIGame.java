import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WheelOfFortuneAIGame extends WheelOfFortune{
    List<WheelOfFortunePlayer> playerList;
    WheelOfFortunePlayer wheelOfFortunePlayer;
    int indexOfPlayer = 0;
    int indexOfGame = 0;
    public WheelOfFortuneAIGame(){
        playerList = new ArrayList<>();
        playerList.add(new DumbAI());
        wheelOfFortunePlayer = playerList.get(indexOfPlayer);
    }

    public WheelOfFortuneAIGame(WheelOfFortunePlayer player){
        assert player != null : "Player cannot be null";
        playerList = new ArrayList<>();
        playerList.add(player);
        wheelOfFortunePlayer = playerList.get(indexOfPlayer);
    }

    public WheelOfFortuneAIGame(List<WheelOfFortunePlayer> playerList){
        assert playerList != null : "PlayerList cannot be null";
        this.playerList = new ArrayList<>(playerList);
        wheelOfFortunePlayer = playerList.get(indexOfPlayer);
    }

    // rewrite the random phrase so each phrase is played for each player
    @Override
    public void randomPhrase() {
        List<String> phraseList = null;
        try {
            phraseList = Files.readAllLines(Paths.get("phrases.txt"));
        } catch (IOException e) {
            System.out.println(e);
        }
        int curGameIndex;
        if(indexOfGame < phraseList.size()){
            curGameIndex = indexOfGame;
        } else{
            indexOfGame = 0;
            curGameIndex = indexOfGame;
            indexOfPlayer++;
        }
        phrase = phraseList.get(curGameIndex);
        System.out.println("A secret phrase has been generated.");
    }

    @Override
    public char getGuess() {
        return ' ';
    }

    @Override
    public GameRecord play() {
       return super.play();
    }

    @Override
    public boolean playNext() {
        if(indexOfPlayer < playerList.size()){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String [] args) {
        DumbestAI dumbestAI = new DumbestAI();
        WheelOfFortuneAIGame wheelOfFortuneAIGame = new WheelOfFortuneAIGame(dumbestAI);
        AllGamesRecord record = wheelOfFortuneAIGame.playAll();
        System.out.println(record);  // or call specific functions of record
    }
}
