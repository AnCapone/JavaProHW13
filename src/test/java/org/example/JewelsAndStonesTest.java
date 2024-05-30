package org.example;

import org.junit.Assert;
import org.junit.Test;

public class JewelsAndStonesTest {

    @Test
    public void numJewelsInStoneTest() {
        JewelsAndStones jewelsAndStones = new JewelsAndStones();

        String jewels = "mM";
        String stones = "hgemjsgfrngdmgjwhgjkembfvfmdn";

        int result = 4;

        int actual = jewelsAndStones.numJewelsInStones(jewels, stones);

        assert result == actual;

    }
}
