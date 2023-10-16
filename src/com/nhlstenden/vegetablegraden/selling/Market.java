package com.nhlstenden.vegetablegraden.selling;

import java.util.HashSet;

public class Market
{
    private final HashSet<Sellable> sellables;

    public Market()
    {
        this.sellables = new HashSet<>();
    }

    public HashSet<Sellable> getSellables()
    {
        return this.sellables;
    }

    public void addSellable(Sellable sellable)
    {
        this.sellables.add(sellable);
    }

    public double getProfit()
    {
        double profit = 0.0;

        for (Sellable sellable : this.sellables)
        {
            if (sellable.isSellable())
            {
                profit += sellable.getPrice();
            }
        }

        return profit;
    }
}
