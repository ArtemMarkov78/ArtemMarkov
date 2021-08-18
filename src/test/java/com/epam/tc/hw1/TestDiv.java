package com.epam.tc.hw1;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDiv {

    Calculator calculator = new Calculator();

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        //Do some stuff
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        //Undo the stuff
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "divLong", groups = {"MultDiv"})
    public void testDivLong(long a, long b, long expected) {
        long actual = calculator.div(a, b);
        assertThat(actual)
                .as("Something went wrong when dividing long values")
                .isEqualTo(expected);
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "divDouble", groups = {"MultDiv"})
    public void testDivDouble(double a, double b, double expected) {
        double actual = calculator.div(a, b);
        assertThat(actual)
                .as("Something went wrong when dividing double values")
                .isEqualTo(expected);
    }

    @Test(expectedExceptions = NumberFormatException.class, dataProviderClass = DataProviders.class,
        dataProvider = "divZeroLong", groups = {"MultDiv"})
    public void testDivZeroLong(long a, long b) {
        calculator.div(a, b);
    }

    @Test(expectedExceptions = NumberFormatException.class, dataProviderClass = DataProviders.class,
        dataProvider = "divZeroDouble", groups = {"MultDiv"})
    public void testDivZeroDouble(double a, double b) {
        calculator.div(a, b);

    }
}