package com.home;

public class King extends Figure {

    public void setPosition(int strPos) {
        super.setPosition(strPos);
        target[0] = position[0];
        target[1] = position[1];
    }

    public boolean attackIsPossible() {
        return false;
    }
}