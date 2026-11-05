package session8.C_TDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Step C. The class BadmintonPlayer does not exist yet. A badminton player has
 * a name and the number of matches won and lost. BadmintonPlayer.wonMatch
 * records a won match, and BadmintonPlayer.lostMatch a lost one. Each test is
 * written before the code it asks for.
 */
public class BadmintonPlayerTest {

    // --- EXERCISE C --------------------------------------------------
    // Write the tests here, one at a time, each before its code. See
    // src/session8/C_TDD/EXERCISES.md.
    @Test
    public void newPlayerTest(){
        BadmintonPlayer player = new BadmintonPlayer("Alice", 0, 8);
        assertNotNull(player);
    }

    @Test
    public void playerNameTest(){
        BadmintonPlayer player = new BadmintonPlayer("Beatrice", 0, 5);
        assertEquals("Beatrice", player.getName());
    }

    @Test
    public void playerMatchesWonTest(){
        BadmintonPlayer player = new BadmintonPlayer("Cassandra", 2, 4);
        assertEquals(2, player.getMatchesWon());
    }

    @Test
    public void playerMatchesLostTest(){
        BadmintonPlayer player = new BadmintonPlayer("Din Moar", 0, 3);
        assertEquals(3, player.getMatchesLost());
    }

}
