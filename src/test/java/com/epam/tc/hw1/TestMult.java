package com.epam.tc.hw1;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMult {

    Calculator calculator = new Calculator();

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        //Do some stuff
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        //Undo the stuff
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "multLong", groups = {"MultDiv"})
    public void testMultLong(long a, long b, long expected) {
        long actual = calculator.mult(a, b);
        assertThat(actual)
                .as("Something went wrong when multiplying long values")
                .isEqualTo(expected);
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "multDouble", groups = {"MultDiv"})
    public void testMultDouble(double a, double b, double expected) {
        double actual = calculator.mult(a, b);
        assertThat(actual)
                .as("Something went wrong when multiplying double values")
                .isEqualTo(expected);
    }
}
