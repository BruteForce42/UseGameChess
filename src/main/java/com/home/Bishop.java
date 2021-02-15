package com.home;

public class Bishop extends Figure{

    public void setPosition(int strPos) {
        super.setPosition(strPos);
        location[2][0] = position[0];
        location[2][1] = position[1];
    }

    public boolean attackIsPossible() {
        // 	for understanding:
        //	abs(Xpos - Xtarg) == abs(Ypos - Ytarg)

        if (Math.abs(position[0] - target[0]) == Math.abs(position[1] - target[1])) {
            for (int i=0; i<5; i++) {
                if (i == 2) continue;
                if (Math.abs(position[0] - location[i][0]) == Math.abs(position[1] - location[i][1])) {
                    if (Math.abs(target[0] - location[i][0]) == Math.abs(target[1] - location[i][1])) {
                        if (((position[0] > target[0]) && (location[i][0] > target[0]) && (position[0] > location[i][0]))
                                || ((position[0] < target[0]) && (location[i][0] < target[0]) && (position[0] < location[i][0])))
                            return false;
                    }
                }
            }
            return true;
        } else return false;
    }
}