package lab3;

public class Knight extends Piece {

  public Knight(int value, boolean isWhite) {
    super(value, isWhite);
  }

  @Override
  public String toString() {
    return "Knight{value='" + value + '\'' + '}';
  }

  @Override
  void move() {
    System.out.println("Like an L");
  }
}
