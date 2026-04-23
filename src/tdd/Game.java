package tdd;

public class Game {

    private int[] rolls = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll] = pins;
        currentRoll = currentRoll + 1;
    }

    public int score() {
        int score = 0;
        int i = 0;

        for (int frame = 0; frame < 10; frame++) {

            if (rolls[i] + rolls[i + 1] == 10) {
                score = score + 10 + rolls[i + 2];
                i = i + 2;
            } else {
                score = score + rolls[i] + rolls[i + 1];
                i = i + 2;
            }
        }

        return score;
    }
}