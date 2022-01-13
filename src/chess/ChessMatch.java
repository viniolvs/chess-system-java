package chess;

import boardgame.Position;
import boardgame.Board;
import chess.pieces.Rook;
import chess.pieces.King;

public class ChessMatch {
    private Board board;

    public ChessMatch(){
        board = new Board(8,8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }

    private void initialSetup(){
        board.placePiece(new Rook(board,Color.WHITE), new Position(7,7));
        board.placePiece(new Rook(board,Color.WHITE), new Position(7,0));
        board.placePiece(new King(board,Color.WHITE),new Position(7,4));
    }
}
