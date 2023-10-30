public class Player {
  private State color;
  private int score;
  private String name;


  public Player(State color, String name) {
    this.color = color;
    this.name = name;
    this.score = 0;  // Initially, players might have 2 discs each, adjust as needed
  }

  public State getColor() {
    return color;
  }

  public int getScore() {
    return score;
  }

  public String getName() {
    return name;
  }

  public void setScore(int score) {
    this.score = score;
  }
}
