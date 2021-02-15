package com.home;

public class Pawn extends Figure {

    public void setPosition(int strPos) {
        super.setPosition(strPos);
        location[4][0] = position[0];
        location[4][1] = position[1];
    }

    public boolean attackIsPossible() {
        // 	for understanding:
        //	((Ypos + 1) == Ytarg)
        //	&& (((Xpos + 1) == Xtarg) || ((Xpos - 1) == Xtarg))

        return ((position[1] + 1) == target[1])
                && (((position[0] + 1) == target[0])
                || ((position[0] - 1) == target[0]));
    }
}