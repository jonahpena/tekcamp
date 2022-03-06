package com.teksystems.bootcamp.java_exercises.gridHopper;

import java.util.Random;

public class BoardGenerator {

    public static LocationPointer[][] createBoard(int size, int seed){
        Random random = new Random(seed);
        LocationPointer[][] board = new LocationPointer[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j]=new LocationPointer(random.nextInt(size), random.nextInt(size));
            }
        }
        return board;
    }
}













// Generates a square 2D array of LocationPointers, using the seed to randomly populate the board with random LocationPointers
// LocationPointers should randomly range between 0 and (size - 1) for both targetX and targetY
// the same size and seed should always generate the same 2D array and set of LocationPointers












