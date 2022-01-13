package application;
import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class App {
    public static void main(String[] args) throws Exception {
        
        ChessMatch match = new ChessMatch();
        while(true){

            Scanner sc = new Scanner(System.in);
            UI.printBoard(match.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = match.performChessMove(source, target);
        }
        
    }
}
