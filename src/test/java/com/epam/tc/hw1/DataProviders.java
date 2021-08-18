package com.epam.tc.hw1;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "sumLong")
    public static Object[][] sumLong() {
        return new Object[][]{{2L, 2L, 4L}, {3L, 3L, 6L}, {-1L, 2L, 1L}, {-1L, -1L, -2L}, {-1L, 1L, 0L}};
    }

    @DataProvider(name = "sumDouble")
    public static Object[][] sumDouble() {
        return new Object[][]{{4.0, 5.0, 9.0}, {-4, 5, 1}, {3.2, 2.7, 5.9}, {-5.2, 5.2, 0}, {-6.67, -3.32, -9.9}};
    }

    @DataProvider(name = "subLong")
    public static Object[][] subLong() {
        return new Object[][]{{3L, 2L, 1L}, {10L, 10L, 0L}, {6L, 8L, -2L}, {-1L, -2L, 1L}, {-10L, 100L, -110L}};
    }

    @DataProvider(name = "subDouble")
    public static Object[][] subDouble() {
        return new Object[][]{{4.0, 1.0, 3.0}, {15.2, 6.3, 8.9}, {5.0, 5.0, 0}, {4.2, 5.6, -1.4}, {-4.4, 5.5, -9.9}};
    }

    @DataProvider(name = "multLong")
    public static Object[][] multLong() {
        return new Object[][]{{0L, 2L, 0L}, {1L, 2L, 2L}, {4L, 6L, 24L}, {-8L, 6L, -48L}, {-5L, -4L, 20L}};
    }

    @DataProvider(name = "multDouble")
    public static Object[][] multDouble() {
        return new Object[][]{{2.4, 0, 0}, {1.3, 1.0, 1.3}, {3.6, 0.5, 1.8}, {100, 2.5, 250},
            {6.4, 1.2, -7.68}, {0.5, 0.2, 0.1}, {-3.5, -6.5, 22.75}};
    }

    @DataProvider(name = "divLong")
    public static Object[][] divLong() {
        return new Object[][]{{0L, 2L, 0L}, {6L, 3L, 2L}, {-4L, 1L, -4L}, {-8L, -4L, 2L}, {2L, 6L, 0L}};
    }

    @DataProvider(name = "divDouble")
    public static Object[][] divDouble() {
        return new Object[][]{{0, 3.5, 0}, {25.5, 5.1, 5.0}, {7.26, 2.2, 3.3}, {-6.4, 3.2, -2}, {-29.97, -8.1, 3.7},
            {20.855837832, 3.67, 5.6827896}};
    }

    @DataProvider(name = "divZeroLong")
    public static Object[][] divZeroLong() {
        return new Object[][]{{1L, 0L}};
    }

    @DataProvider(name = "divZeroDouble")
    public static Object[][] divZeroDouble() {
        return new Object[][]{{3.4, 0}};
    }

}
