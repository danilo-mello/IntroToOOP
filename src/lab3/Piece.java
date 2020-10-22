package lab3;

import java.util.Objects;

abstract class Piece {

  public int value;
  private boolean isWhite;

  public Piece() {
  }

  public Piece(int value, boolean isWhite) {
    this.value = value;
    this.isWhite = isWhite;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public boolean isWhite() {
    return isWhite;
  }

  public void setWhite(boolean white) {
    isWhite = white;
  }

  abstract void move();

  @Override
  public String toString() {
    return "Piece{" +
        "value=" + value +
        ", isWhite=" + isWhite +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Piece piece = (Piece) o;
    return value == piece.value &&
        isWhite == piece.isWhite;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, isWhite);
  }

}
