import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class BasicReversiTest {

  @Test
  public void testRender() {
    BasicReversi reversi = new BasicReversi(); // assuming size 3 for simplicity
    reversi.startGame(6);
    StringBuilder output = new StringBuilder();

    ReversiTextualView view = new ReversiTextualView(reversi, output);

    try {
      // Render the view (which writes to the StringBuilder)
      view.render();
    } catch (IOException e) {
      System.err.println("IOException during rendering: " + e.getMessage());
    }

    System.out.println(output.toString());
  }
}