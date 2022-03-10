package com.teksystems.bootcamp.java_exercises.gridHopper;

public class BoardHopper {
    public static LocationPointer hop(LocationPointer[][] board) {
        int xLocation = 0;
        int yLocation = 0;
        int counter = 0;

        while(counter <=100){
            int x = board[xLocation][yLocation].getTargetX();
            int y = board[xLocation][yLocation].getTargetY();
            if (x == xLocation && y == yLocation) {
                return new LocationPointer(xLocation, yLocation);
            }
            xLocation=x;
            yLocation=y;
            counter++;
        }

        return new LocationPointer(xLocation,yLocation);
    }
}

// static LocationPointer hop(LocationPointer[][] board)
// starts at 0,0 reads the LocationPointer, and "jumps" to the indicated array index
// returns the LocationPointer from the final position
// stops when the LocationPointer in the current grid position points to itself, or after 100 jumps