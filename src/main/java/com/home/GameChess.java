package com.home;

public class GameChess {
    private Figure queen;
    private Figure rook;
    private Figure bishop;
    private Figure knight;
    private Figure pawn;

    public boolean isShah(String s) {

        for (int i=0; i<16; i++) {
            switch (s.charAt(i)) {
                case ' ':
                    break;
                case 'K':
                    Figure king = new King();
                    king.setPosition(i);
                    break;
                case 'Q':
                    queen = new Queen();
                    queen.setPosition(i);
                    break;
                case 'R':
                    rook = new Rook();
                    rook.setPosition(i);
                    break;
                case 'B':
                    bishop = new Bishop();
                    bishop.setPosition(i);
                    break;
                case 'N':
                    knight = new Knight();
                    knight.setPosition(i);
                    break;
                case 'P':
                    pawn = new Pawn();
                    pawn.setPosition(i);
                    break;
            }
        }
        return queen.attackIsPossible()
                || rook.attackIsPossible()
                || bishop.attackIsPossible()
                || knight.attackIsPossible()
                || pawn.attackIsPossible();
    }
}