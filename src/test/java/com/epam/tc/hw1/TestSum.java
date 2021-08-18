package com.epam.tc.hw1;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSum {

    Calculator calculator = new Calculator();

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        //Do some stuff
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        //Undo the stuff
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "sumLong", groups = {"SumSub"})
    public void testSumLong(long a, long b, long expected) {
        long actual = calculator.sum(a, b);
        assertThat(actual)
                .as("Something went wrong when summing long values")
                .isEqualTo(expected);
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "sumDouble", groups = {"SumSub"})
    public void testSumDouble(double a, double b, double expected) {
        double actual = calculator.sum(a, b);
        assertThat(actual)
                .as("Something went wrong when summing double values")
                .isEqualTo(expected);
    }
}
