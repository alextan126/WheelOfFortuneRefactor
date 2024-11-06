public abstract class Game {
    //TODO: finish abstract method
    public AllGamesRecord playAll(){

        return new AllGamesRecord();

    };

    public abstract GameRecord play();

    public abstract boolean playNext();
}
