package com.teksystems.bootcamp.java_exercises;
import com.teksystems.bootcamp.java_exercises.findCharacters.CharFinder;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CharFinderTest {
    @Test
    public void LocationShouldReturnAsZero(){
        //arrange
        HashMap<Character, List<Integer>> expected = new HashMap<>();
        ArrayList<Integer> expectedLocations = new ArrayList<>();
        expectedLocations.add(0);

        expected.put('j', expectedLocations);

        HashMap<Character, List<Integer>> actual = new HashMap<>();
        actual.put('j' , Collections.singletonList(0));


        // act

        actual = CharFinder.findMatchPositions("j", "jonah");

        // assert
        Assert.assertEquals(actual, expected);
    }
}
