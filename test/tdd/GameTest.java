package tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void testScoreVide() {
        Game game = new Game();

        assertEquals(0, game.score());
    }

    @Test
    public void test20Fois0() {
        Game game = new Game();

        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }

        assertEquals(0, game.score());
    }

    @Test
    public void test20Fois1() {
        Game game = new Game();

        for (int i = 0; i < 20; i++) {
            game.roll(1);
        }

        assertEquals(20, game.score());
    }

    @Test
    public void test10Fois1Puis10Fois2() {
        Game game = new Game();

        for (int i = 0; i < 10; i++) {
            game.roll(1);
        }

        for (int i = 0; i < 10; i++) {
            game.roll(2);
        }

        assertEquals(30, game.score());
    }
    
    
    @Test
    public void testSpare() {
        Game game = new Game();

        game.roll(7);
        game.roll(3);
        game.roll(4);

        for (int i = 0; i < 17; i++) {
            game.roll(0);
        }

        assertEquals(18, game.score());
    }
}


