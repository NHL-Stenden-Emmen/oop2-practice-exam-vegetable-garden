package com.nhlstenden.vegetablegraden.greenhouse;

import com.nhlstenden.vegetablegraden.garden.Garden;
import com.nhlstenden.vegetablegraden.vegetable.Vegetable;

public class Greenhouse extends Garden
{
    public void runWeather()
    {
        int lux = WeatherGenerator.getLux();
        int mm = WeatherGenerator.getMm();

        for (Vegetable vegetable : this.getVegetables())
        {
            vegetable.grow(lux, mm, 1);
        }
    }
}
