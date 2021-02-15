package com.home;

public abstract class Figure {
    public static int[][] location;
    public static int[] target;
    public int[] position;

    static {
        location = new int[5][2];
        target = new int[2];
    }

    public Figure() {
        position = new int[2];
    }

    public abstract boolean attackIsPossible();

    public void setPosition(int strPos) {
        switch (strPos) {
            case 0:
            case 1:
            case 2:
            case 3:
                position[0] = 1;			// x = A(1),B(2),C(3),D(4)
                position[1] = strPos + 1;	// y = 1,2,3,4
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                position[0] = 2;
                position[1] = strPos - 3;
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                position[0] = 3;
                position[1] = strPos - 7;
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                position[0] = 4;
                position[1] = strPos - 11;
                break;
        }
    }
}