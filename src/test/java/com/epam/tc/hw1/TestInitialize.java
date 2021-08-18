package com.epam.tc.hw1;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;

public class TestInitialize {
    protected Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }
}
