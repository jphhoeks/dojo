package dojo.bowling;

/**
 *
 */
public class Game {

  private int[] worpen = new int[20];
  private int huidigeWorp = 0;

  public void worp(int aantalKegels) {
    worpen[huidigeWorp++] = aantalKegels;
  }

  public int score() {
    int score = 0;
    int worpnr = 0;
    for (int i=0; i < 10; i++) {
      if (worpen[worpnr] + worpen[worpnr+1] == 10) {
        score += 10 + worpen[worpnr+2];
      }
      else {
        score += worpen[worpnr] + worpen[worpnr + 1];
      }
      worpnr += 2;
    }
    return score;
  }
}
