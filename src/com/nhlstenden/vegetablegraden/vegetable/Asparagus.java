package com.nhlstenden.vegetablegraden.vegetable;

import com.nhlstenden.vegetablegraden.selling.Sellable;

public class Asparagus extends Vegetable implements Sellable
{
    public Asparagus()
    {
        super(0.000027, 0.0049, 20, Color.BLUE);
    }

    @Override
    public void grow(int lux, int mm, int amountOfDays)
    {
        if (amountOfDays == 10 && mm < 14)
        {
            this.setStatus(Status.DESTROYED);
            return;
        }

        super.generalGrowth(lux, mm);
    }

    @Override
    public boolean isSellable()
    {
        return this.getStatus() == Status.READY_TO_HARVEST && this.getSizeInCm() <= 29.0;
    }

    @Override
    public double getPrice()
    {
        return this.getSizeInCm() * 0.12;
    }
}
