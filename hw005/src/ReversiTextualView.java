import java.io.IOException;

public class ReversiTextualView {
  private final ReversiModel model;
  private final Appendable appendable;

  public ReversiTextualView(ReversiModel model) {
    this(model, System.out);
  }

  public ReversiTextualView(ReversiModel model, Appendable appendable) {
    if (model == null || appendable == null) {
      throw new IllegalArgumentException("Neither model nor appendable can be null");
    }
    this.model = model;
    this.appendable = appendable;
  }

  public void render() throws IOException {
    appendable.append(this.toString());
    appendable.append("\n");
  }



  public String toString() {
    StringBuilder sb = new StringBuilder();
    
    int totalRows = model.getSize() * 2 - 1;

    for (int r = 0; r < totalRows; r++) {
      int spacesBefore = Math.abs(model.getSize() - (r + 1));  // Calculate the number of spaces needed before each line

      //sb.append("|" + spacesBefore + "|");  // Added for debugging: displays the number of spaces for each row

      for (int s = 0; s < spacesBefore; s++) {
        sb.append(s);
      }

      for (int c = 0; c < model.getBoard()[r].length; c++) {
        if (model.getBoard()[r][c] == null) {
          //sb.append("  ");  // Two spaces for alignment
          continue;
        }

        State state = model.getBoard()[r][c].getState();
        switch (state) {
          case EMPTY:
            sb.append(" -");
            break;
          case BLACK:
            sb.append(" X");
            break;
          case WHITE:
            sb.append(" O");
            break;
        }
      }
      sb.append("\n");
    }

    return sb.toString().trim();
  }
}
