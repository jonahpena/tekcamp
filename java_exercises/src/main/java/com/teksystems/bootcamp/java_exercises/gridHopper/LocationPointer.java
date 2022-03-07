package com.teksystems.bootcamp.java_exercises.gridHopper;

public class LocationPointer {
    int targetX;
    int targetY;

    public LocationPointer(int targetX, int targetY) {
        this.targetX = targetX;
        this.targetY = targetY;
    }

    public int getTargetX() {
        return targetX;
    }

    public int getTargetY() {
        return targetY;
    }
}


//Contains an (int targetX, int targetY) that indicates an index location on the 2D array
// int getTargetX
// int getTargetY