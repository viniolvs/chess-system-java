package boardgame;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if (rows != 8 || columns != 8){
            throw new BoardException("Error creating Board: there must be 8 rows and 8 columns in a chess board!");
        }
        this.columns = columns;
        this.rows = rows;
        pieces = new Piece[rows][columns];
    }

    public int getRows(){
        return rows;
    }
    public int getColumns(){
        return columns;
    }

    public Piece piece(int row, int column){
        if (!positionExists(row,column)){
            throw new BoardException("Position don't exists!");
        }
        return pieces[row][column];
    }

    public Piece piece(Position position) {
        if (!positionExists(position)){
            throw new BoardException("Position don't exists!");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position) {
        if (thereIsAPiece(position)){
            throw new BoardException("There is already a piece on position " + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    private boolean positionExists(int row, int column){
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece(Position position) {
        if (!positionExists(position)){
            throw new BoardException("Position don't exists!");
        }
        return piece(position) != null;
        
    }
}
