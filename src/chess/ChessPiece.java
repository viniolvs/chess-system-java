package chess;

import boardgame.Piece;
import boardgame.Board;

public abstract class ChessPiece extends Piece{
    private Color color;

    public ChessPiece(Board board, Color color){
        super(board); //passa board para o contrutor da classe Piece
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
