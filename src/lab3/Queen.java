package lab3;

public class Queen extends Piece {

  public Queen(int value, boolean isWhite) {
    super(value, isWhite);
  }

  @Override
  public String toString() {
    return "Queen{value='" + value + '\'' + '}';
  }

  @Override
  void move() {
    System.out.println("Like bishop and rook");
  }
}
