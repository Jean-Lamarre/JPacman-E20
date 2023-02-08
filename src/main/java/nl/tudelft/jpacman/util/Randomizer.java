package nl.tudelft.jpacman.util;

import java.util.Random;

public class Randomizer {

    private static Randomizer Instance = null;

    private Random random;

    private Randomizer()
    {
        random = new Random();
    }

    public static Randomizer getInstance()
    {
        if (Instance == null)
            Instance = new Randomizer();

        return Instance;
    }

    public static int nextInt(int length) {
        return getInstance().random.nextInt(length);
    }
}
