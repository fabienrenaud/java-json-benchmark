package com.github.fabienrenaud.jjb;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Random;

public final class RandomUtils {

    private static final Random RANDOM;

    static {
        String seed = System.getenv("SEED");
        if (StringUtils.isNumeric(seed)) {
            System.out.println("Using SEED=" + seed + " as seed for Random");
            RANDOM = new Random(Long.parseLong(seed));
        } else {
            RANDOM = new Random();
        }
    }

    private RandomUtils() {
    }

    public static String randomAlphabetic(final int count) {
        return random(count, true, false);
    }

    public static String randomAlphanumeric(final int count) {
        return random(count, true, true);
    }

    public static String randomNumeric(final int count) {
        return random(count, false, true);
    }

    public static String random(final int count, final boolean letters, final boolean numbers) {
        return random(count, 0, 0, letters, numbers);
    }

    public static String random(final int count, final int start, final int end, final boolean letters, final boolean numbers) {
        return random(count, start, end, letters, numbers, null);
    }

    public static String random(int count, int start, int end, final boolean letters, final boolean numbers, final char[] chars) {
        return RandomStringUtils.random(count, start, end, letters, numbers, chars, RANDOM);
    }

    public static int nextInt(int bound) {
        return RANDOM.nextInt(bound);
    }

    public static int nextInt(final int startInclusive, final int endExclusive) {
        assert endExclusive >= startInclusive;
        assert startInclusive >= 0;

        if (startInclusive == endExclusive) {
            return startInclusive;
        }

        return startInclusive + RANDOM.nextInt(endExclusive - startInclusive);
    }

    public static double nextDouble(final double startInclusive, final double endInclusive) {
        assert endInclusive >= startInclusive;
        assert startInclusive >= 0;

        if (startInclusive == endInclusive) {
            return startInclusive;
        }

        return startInclusive + ((endInclusive - startInclusive) * RANDOM.nextDouble());
    }
}
