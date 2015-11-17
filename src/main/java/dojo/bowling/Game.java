package dojo.bowling;

/**
 *
 */
public class Game {

  private int score = 0;

  public void worp(int aantalKegels) {
    score += aantalKegels;
  }

  public int score() {
    return score;
  }
}
