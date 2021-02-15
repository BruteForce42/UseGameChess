package com.home;

public class Queen extends Figure {

    public void setPosition(int strPos) {
        super.setPosition(strPos);
        location[0][0] = position[0];
        location[0][1] = position[1];
    }

    public boolean attackIsPossible() {
        if (position[0] == target[0]) {			//	Xpos == Xtarg
            for (int i=0; i<5; i++) {
                if (i == 0) continue;
                if (position[0] == location[i][0]) {	//	Looking for a vertical placed piece with a queen
                    if (((position[1] < target[1]) && (position[1] < location[i][1]) && (location[i][1] < target[1]))
                            || ((position[1] > target[1]) && (position[1] > location[i][1]) && (location[i][1] > target[1])))
                        return false;
                }
            }
            return true;
        } else if (position[1] == target[1]) {	//	Ypos == Ytarg
            for (int i=0; i<5; i++) {
                if (i == 0) continue;
                if (position[1] == location[i][1]) {	//	Looking for a horizontal placed piece with a queen
                    if (((position[0] < target[0]) && (position[0] < location[i][0]) && (location[i][0] < target[0]))
                            || ((position[0] > target[0]) && (position[0] > location[i][0]) && (location[i][0] > target[0])))
                        return false;
                }
            }
            return true;
        } else if (Math.abs(position[0] - target[0]) == Math.abs(position[1] - target[1])) {
            for (int i=0; i<5; i++) {
                if (i == 0) continue;
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