public class DumbAI implements WheelOfFortunePlayer{
    //dumb AI loop through all gusses
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    int index = 0;
    @Override
    public char nextGuess() {
        char guess = alphabet.charAt(index);
        index = (index + 1) % alphabet.length();  // Increment and wrap index
        return guess;
    }

    @Override
    public String playerId() {
        return "dumbAI";
    }

    @Override
    public void reset() {
        index = 0;
    }
}
