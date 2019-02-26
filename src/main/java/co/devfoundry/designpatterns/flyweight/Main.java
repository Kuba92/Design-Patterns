package co.devfoundry.designpatterns.flyweight;

import co.devfoundry.designpatterns.flyweight.pieces.*;

public class Main {

    public static void main(String[] args) {

        ChessPiece blackKing = new BlackKing("Czarny Król");

        ChessPiece blackQueen = new BlackQueen("Czarna Królowa");

        ChessPiece whiteKing = new WhiteKing("Biały Król");

        ChessPiece whiteQueen = new WhiteQueen("Biała Królowa");

        System.out.println(blackKing.toString());

        System.out.println(blackKing.getColor() == blackQueen.getColor());

        System.out.println(whiteKing.getColor() == whiteQueen.getColor());
    }
}
