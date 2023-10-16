package com.nhlstenden.vegetablegraden.greenhouse;

import java.util.Random;

public class WeatherGenerator
{
    private static final int MIN_AMOUNT_OF_LUX = 1000;
    private static final int MAX_AMOUNT_OF_LUX = 101592;
    private static final int MIN_AMOUNT_OF_MM = 0;
    private static final int MAX_AMOUNT_OF_MM = 49;

    public static int getLux()
    {
        return (new Random()).nextInt(MIN_AMOUNT_OF_LUX, MAX_AMOUNT_OF_LUX + 1);
    }

    public static int getMm()
    {
        return (new Random()).nextInt(MIN_AMOUNT_OF_MM, MAX_AMOUNT_OF_MM + 1);
    }
}
