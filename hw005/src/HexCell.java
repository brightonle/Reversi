public class HexCell {
  private State state;

  // Constructor to initialize the cell as empty
  public HexCell() {
    this.state = State.EMPTY;
  }

  // Getter method for the cell's state
  public State getState() {
    return state;
  }

  // Setter method to change the cell's state
  public void setState(State state) {
    this.state = state;
  }
}
