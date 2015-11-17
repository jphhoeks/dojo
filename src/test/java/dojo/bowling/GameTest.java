package dojo.bowling;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

  @Test
  public void elkeWorpNulKegels() {
    Game g = new Game();
    for (int i = 0; i < 20; i++) {
      g.worp(0);
    }
    assertEquals(0, g.score());
  }

}
