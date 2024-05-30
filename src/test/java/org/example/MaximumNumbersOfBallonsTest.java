package org.example;

import org.junit.Test;

public class MaximumNumbersOfBallonsTest {
    @Test
    public void maxNumberOfBalloonsTest() {
        MaximumNumbersOfBallons maximumNumbersOfBallons = new MaximumNumbersOfBallons();

        String textToLook = "looonnbaxballpoolon";

        int result = 2;

        int actual = maximumNumbersOfBallons.maxNumberOfBalloons(textToLook);
        assert result == actual;
    }
}
