package com.teksystems.bootcamp.java_exercises.gridHopper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int size = scanner.nextInt();

        LocationPointer[][] viewBoard = BoardGenerator.createBoard(size, size);
        LocationPointer finalLocation = BoardHopper.hop(viewBoard);
            for(int i=0; i < viewBoard.length; i++) {
                for (int j = 0; j < viewBoard.length; j++) {
                    System.out.print("("+viewBoard[i][j].getTargetX() + " , " + viewBoard[i][j].getTargetY() + ")");
                }
                System.out.println(" ");
            }
        System.out.println(" ");
        System.out.println(finalLocation.getTargetX() + " , " + finalLocation.getTargetY());
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