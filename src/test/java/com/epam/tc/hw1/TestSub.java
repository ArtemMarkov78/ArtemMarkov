package com.epam.tc.hw1;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.testng.annotations.Test;

public class TestSub extends TestInitialize {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "subLong", groups = {"SumSub"})
    public void testSubLong(long a, long b, long expected) {
        long actual = calculator.sub(a, b);
        assertThat(actual)
                .as("Something went wrong when subtracting long values")
                .isEqualTo(expected);
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "subDouble", groups = {"SumSub"})
    public void testSubDouble(double a, double b, double expected) {
        double actual = calculator.sub(a, b);
        assertThat(actual)
                .as("Something went wrong when subtracting double values")
                .isEqualTo(expected);
    }
}
