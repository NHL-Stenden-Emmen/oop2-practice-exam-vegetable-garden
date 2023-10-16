package com.nhlstenden.vegetablegraden.garden;

import com.nhlstenden.vegetablegraden.selling.Market;
import com.nhlstenden.vegetablegraden.selling.Sellable;
import com.nhlstenden.vegetablegraden.vegetable.Status;
import com.nhlstenden.vegetablegraden.vegetable.Vegetable;

import java.util.HashSet;

public class Garden implements GardenBase
{
    private final HashSet<Vegetable> vegetables;
    private final Market market;

    public Garden()
    {
        this.vegetables = new HashSet<>();
        this.market = new Market();
    }

    public HashSet<Vegetable> getVegetables()
    {
        return this.vegetables;
    }

    public void addVegetable(Vegetable vegetable) throws TooManyVegetablesException
    {
        // Assignment 3
        if (this.vegetables.size() >= 27)
        {
            throw new TooManyVegetablesException();
        }

        this.vegetables.add(vegetable);

        // This is optional. We try to prevent instanceof and casting at all cost!!!
        if (vegetable instanceof Sellable)
        {
            this.market.addSellable((Sellable) vegetable);
        }
    }

    public HashSet<Vegetable> getReadyForHarvest()
    {
        HashSet<Vegetable> readyForHarvest = new HashSet<>();

        for (Vegetable vegetable : this.vegetables)
        {
            if (vegetable.getStatus() == Status.READY_TO_HARVEST)
            {
                readyForHarvest.add(vegetable);
            }
        }

        return readyForHarvest;
    }
}
