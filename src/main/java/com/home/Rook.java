package com.home;

public class Rook extends Figure {

    public void setPosition(int strPos) {
        super.setPosition(strPos);
        location[1][0] = position[0];
        location[1][1] = position[1];
    }

    public boolean attackIsPossible() {
        if (position[0] == target[0]) {			//	Xpos == Xtarg
            for (int i=0; i<5; i++) {
                if (i == 1) continue;
                if (position[0] == location[i][0]) {	//	Looking for a vertical placed piece with a rook
                    if (((position[1] < target[1]) && (position[1] < location[i][1]) && (location[i][1] < target[1]))
                            || ((position[1] > target[1]) && (position[1] > location[i][1]) && (location[i][1] > target[1])))
                        return false;
                }
            }
            return true;
        } else if (position[1] == target[1]) {	//	Ypos == Ytarg
            for (int i=0; i<5; i++) {
                if (i == 1) continue;
                if (position[1] == location[i][1]) {	//	Looking for a horizontal placed piece with a rook
                    //	for understanding:
                    //	((Xpos < Xtarg)&&(Xpos < Xfig)&&(Xfig < Xtarg))
                    //	|| ((Xpos > Xtarg)&&(Xpos > Xfig)&&(Xfig > Xtarg))

                    if (((position[0] < target[0]) && (position[0] < location[i][0]) && (location[i][0] < target[0]))
                            || ((position[0] > target[0]) && (position[0] > location[i][0]) && (location[i][0] > target[0])))
                        return false;
                }
            }
            return true;
        } else return false;
    }
}