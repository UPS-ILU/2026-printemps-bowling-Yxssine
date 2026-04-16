package tdd;

public class Game {
    private int[] rolls = new int[20];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll] = pins;
        currentRoll = currentRoll + 1;
    }

    public int score() {
        int score = 0;

        for (int i = 0; i < currentRoll; i++) {
            score = score + rolls[i];
        }

        return score;
    }
}
