package com.home;

import java.io.*;

public class UseGameChess {

    public static void main(String[] args) {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        boolean shah = false;

        while (true) {
            try {
                System.out.println("Enter a string representing the pieces on the 4 * 4 board"
                        + "\n" + "Black King - 'K', White Queen - 'Q', White Bishop - 'B',"
                        + " White Knight - 'N', White Rook - 'R', White Pawn - 'P', Space - ' '"
                        + "\n" + "The row is displayed on the cells as A1..A4,B1..B4,C1..C4,D1..D4");
                String s = br.readLine();	// A1-A4, B1-B4, C1-C4, D1-D4
                if (!checkString(s)) throw new WrongStringException();
                GameChess game = new GameChess();
                shah = game.isShah(s);
                System.out.println("King under the Shah: " + shah);
            } catch (Exception e) {
                System.out.println("You entered an incorrect string" + "\n" + "Please try again");
            }
        }
    }

    static boolean checkString(String s) {
        int k = 0, q = 0, r = 0, b = 0, n = 0, p = 0;
        if (s.length() != 16) return false;
        for (int i=0; i<s.length(); i++) {
            switch (s.charAt(i)) {
                case ' ':
                    break;
                case 'K':
                    k++;
                    break;
                case 'Q':
                    q++;
                    break;
                case 'R':
                    r++;
                    break;
                case 'B':
                    b++;
                    break;
                case 'N':
                    n++;
                    break;
                case 'P':
                    p++;
                    break;
            }
        }
        return k == 1 && q == 1 && r == 1 && b == 1 && n == 1 && p == 1;
    }
}