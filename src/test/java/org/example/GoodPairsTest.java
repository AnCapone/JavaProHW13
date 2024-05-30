package org.example;

import org.junit.Test;

public class GoodPairsTest {
    @Test
    public void numIdenticalPairsTest() {
        GoodPairs goodPairs = new GoodPairs();

        int[] nums = {1, 2, 3, 1, 1, 3};

        int result = 4;

        int actual = goodPairs.numIdenticalPairs(nums);

        assert result == actual;

    }
}
