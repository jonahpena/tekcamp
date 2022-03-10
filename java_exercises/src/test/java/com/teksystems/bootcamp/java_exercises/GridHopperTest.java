package com.teksystems.bootcamp.java_exercises;

import com.teksystems.bootcamp.java_exercises.gridHopper.BoardGenerator;
import com.teksystems.bootcamp.java_exercises.gridHopper.BoardHopper;
import com.teksystems.bootcamp.java_exercises.gridHopper.LocationPointer;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GridHopperTest {
    @Test
    public static void getTargetXShouldReturnZero(){
        LocationPointer[][] board = BoardGenerator.createBoard(2,5);
        LocationPointer actual = BoardHopper.hop(board);
        LocationPointer expected = new LocationPointer(0,1);

        Assert.assertEquals(actual.getTargetX(), expected.getTargetX());
    }
    @Test
    public static void getTargetYShouldReturnOne(){
        LocationPointer[][] board = BoardGenerator.createBoard(2,5);
        LocationPointer actual = BoardHopper.hop(board);
        LocationPointer expected = new LocationPointer(0,1);

        Assert.assertEquals(actual.getTargetY(), expected.getTargetY());
    }
}
