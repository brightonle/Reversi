import org.junit.Test;

import static org.junit.Assert.*;

public class ReversiTextualViewTest {

  @Test
  public void testToString() {
    BasicReversi reversi = new BasicReversi();
    reversi.startGame(3);
    StringBuilder output = new StringBuilder();

    ReversiTextualView view = new ReversiTextualView(reversi, output);
  }
}