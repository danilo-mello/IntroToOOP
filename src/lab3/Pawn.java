package lab3;

import java.util.Objects;
import java.util.Scanner;

public class Pawn extends Piece {

  private boolean promoted;
  private Piece newPiece;


  public Pawn(int value, boolean isWhite, boolean promoted, Piece newPiece) {
    super(value, isWhite);
    this.promoted = promoted;
    this.newPiece = newPiece;
  }

  public void promote(Piece newPiece) {
    if (isPromoted()){
      this.newPiece = newPiece;
    }
  }

  public Piece getNewPiece() {
    return newPiece;
  }

  public boolean isPromoted() {
    return promoted;
  }

  @Override
  public String toString() {
    return "Pawn{value='" + value + '\'' + '}';
  }

  @Override
  void move() {
    System.out.println("Forward 1");
//    if (isWhite()) {
//      this.position++;
//    }
//    this.position--;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Pawn pawn = (Pawn) o;
    return promoted == pawn.promoted &&
        Objects.equals(newPiece, pawn.newPiece);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), promoted, newPiece);
  }

}
