package com.nhlstenden.vegetablegraden.vegetable;

import com.nhlstenden.vegetablegraden.selling.Sellable;

public class Pepper extends Vegetable implements Sellable
{
    public Pepper()
    {
        super(0.000044, 0.0013, 7, Color.PINK);
    }

    @Override
    public void grow(int lux, int mm, int amountOfDays)
    {
        if (amountOfDays > 4 && mm > 31)
        {
            this.setStatus(Status.DESTROYED);
            return;
        }

        if (amountOfDays == 10 && mm < 25)
        {
            // Don't grow
            return;
        }

        super.generalGrowth(lux, mm);
    }

    @Override
    public boolean isSellable()
    {
        return this.getStatus() == Status.READY_TO_HARVEST && this.getSizeInCm() >= 15.0 && this.getSizeInCm() <= 21.0;
    }

    @Override
    public double getPrice()
    {
        return this.getSizeInCm() * 0.15;
    }
}
