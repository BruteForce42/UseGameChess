package com.home;

public class Knight extends Figure{

    public void setPosition(int strPos) {
        super.setPosition(strPos);
        location[3][0] = position[0];
        location[3][1] = position[1];
    }

    public boolean attackIsPossible() {
        // 	for understanding:
        //	((((Xpos + 1)==Xtarg)||((Xpos - 1)==Xtarg))&&(((Ypos + 2)==Ytarg)||((Ypos - 2)==Ytarg)))
        //	|| 	((((Xpos + 2)==Xtarg)||((Xpos - 2)==Xtarg))&&(((Ypos + 1)==Ytarg)||((Ypos - 1)==Ytarg)))

        return ((((position[0] + 1) == target[0]) || ((position[0] - 1) == target[0]))
                && (((position[1] + 2) == target[1]) || (position[1] - 2) == target[1]))
                || ((((position[0] + 2) == target[0]) || ((position[0] - 2) == target[0]))
                && (((position[1] + 1) == target[1]) || (position[1] - 1) == target[1]));
    }
}