package org.example;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        return (int) stones.chars()
                .filter(stone -> jewels.indexOf(stone) != -1)
                .count();
    }
}
