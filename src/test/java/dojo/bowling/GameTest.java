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
    werpMeerdereKeren(0);
    assertEquals(0, game.score());
  }

  private void werpMeerdereKeren(int aantalKegels) {
    for (int i = 0; i < 20; i++) {
      game.worp(aantalKegels);
    }
  }

  @Test
  public void elkeWorpEenKegel() {
    werpMeerdereKeren(1);
    assertEquals(20, game.score());
  }

}
