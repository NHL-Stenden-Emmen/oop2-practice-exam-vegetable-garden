package com.nhlstenden.vegetablegraden.greenhouse;

public class WeatherGenerator
{
    public static int getLux()
    {
        return (int) (Math.random() * 100592) + 1000;
    }

    public static int getMm()
    {
        return (int) (Math.random() * 49);
    }
}
