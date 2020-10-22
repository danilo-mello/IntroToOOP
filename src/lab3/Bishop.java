package lab3;

public class Bishop extends Piece {

  public Bishop(int value, boolean isWhite) {
    super(value, isWhite);
  }

  @Override
  public String toString() {
    return "Bishop{value='" + value + '\'' + '}';
  }

  @Override
  void move() {
    System.out.println("Diagonally");
  }
}
