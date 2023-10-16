package com.nhlstenden.vegetablegraden.vegetable;

public class Kale extends Vegetable
{
    public Kale()
    {
        super(0.0057, 0.032, 16, Color.YELLOW);
    }

    @Override
    public void grow(int lux, int mm, int amountOfDays)
    {
        if (amountOfDays == 6 && mm > 40)
        {
            // Don't grow
            return;
        }

        super.generalGrowth(lux, mm);
    }
}
