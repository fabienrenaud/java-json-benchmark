package com.github.fabienrenaud.jjb;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.Random;
import java.util.UUID;

public final class RandomUtils {

    private static final Random RANDOM;

    static {
        String seedStr = System.getenv("SEED");
        long seed = StringUtils.isNumeric(seedStr)
                ? Long.parseLong(seedStr)
                : System.nanoTime(); // only relevant for unit tests
        System.out.println("Using SEED=" + seed + " as seed for Random");
        RANDOM = new Random(seed);
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

    public static BigDecimal randomBigDecimal() {
        return BigDecimal.valueOf(RANDOM.nextDouble());
    }

    public static UUID nextUUID() {
        return new UUID(RANDOM.nextLong(), RANDOM.nextLong());
    }

    public static long nextLong() {
        return RANDOM.nextLong();
    }

    public static long[] longArray(int size) {
        long[] arr = new long[size];
        for (int i = 0;i < size; i++) {
            arr[i] = Math.abs(RANDOM.nextInt());
        }
        return arr;
    }

    public static String[] stringArray(int size, int count) {
        String[] arr = new String[size];
        for (int i = 0;i < size; i++) {
            arr[i] = randomAlphabetic(count);
        }
        return arr;
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
