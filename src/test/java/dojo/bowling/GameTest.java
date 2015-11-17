package dojo.bowling;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

  private Game game;

  @Before
  public void setup() {
    game = new Game();
  }

  @Test
  public void elkeWorpNulKegels() {
    werpMeerdereKeren(20, 0);
    assertEquals(0, game.score());
  }

  private void werpMeerdereKeren(int aantalWorpen, int aantalKegels) {
    for (int i = 0; i < aantalWorpen; i++) {
      game.worp(aantalKegels);
    }
  }

  @Test
  public void elkeWorpEenKegel() {
    werpMeerdereKeren(20, 1);
    assertEquals(20, game.score());
  }

  @Test
  public void spare() {
    game.worp(6);
    game.worp(4);
    game.worp(3);
    werpMeerdereKeren(17, 0);
    assertEquals(16, game.score());
  }
}
