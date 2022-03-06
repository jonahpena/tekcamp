package com.teksystems.bootcamp.java_exercises.gridHopper;

public class Main {
    public static void main(String[] args) {

    }
}

//LocationPointer
//Contains an (int targetX, int targetY) that indicates an index location on the 2D array
// int getTargetX
// int getTargetY

//BoardGenerator
    //static LocationPointer[][] createBoard(int size, int seed);
        // Generates a square 2D array of LocationPointers, using the seed to randomly populate the board with random LocationPointers
        // LocationPointers should randomly range between 0 and (size - 1) for both targetX and targetY
        // the same size and seed should always generate the same 2D array and set of LocationPointers

//BoardHopper
    // static LocationPointer hop(LocationPointer[][] board)
        // starts at 0,0 reads the LocationPointer, and "jumps" to the indicated array index
        // returns the LocationPointer from the final position
        // stops when the LocationPointer in the current grid position points to itself, or after 100 jumps