package lab3;

import java.util.ArrayList;

public class Driver {


  public static void main(String[] args) {

    ArrayList<Piece> pieces = new ArrayList<>();

    Pawn p1 = new Pawn(1, true, true, new Queen(9, true));
    Piece p2 = new Pawn(1, true, false, null);
    Piece p3 = new Pawn(1, false, false, null);
    Piece p4 = new Pawn(1, false, true, new Queen(9, true));
    Piece p5 = new Pawn(1, true, true, new Knight(3, true));

    Piece bishop = new Bishop(3,true);
    Piece king = new King(1000, true);
    Piece knight = new Knight(3, true);
    Piece queen = new Queen(9, true);
    Piece rook = new Rook(5, true);

    pieces.add(p1);
    pieces.add(p2);
    pieces.add(p3);
    pieces.add(p4);
    pieces.add(p5);
    pieces.add(bishop);
    pieces.add(king);
    pieces.add(knight);
    pieces.add(queen);
    pieces.add(rook);

    for (Piece piece : pieces) {
      piece.move();
    }

    System.out.println(p1.equals(p2));
    System.out.println(p1.equals(p4));
    System.out.println(p1.equals(p5));
    System.out.println(p2.equals(p3));
    System.out.println(p4.equals(p5));

  }

}
