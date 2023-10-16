package com.nhlstenden.vegetablegraden.garden;

import com.nhlstenden.vegetablegraden.vegetable.Status;
import com.nhlstenden.vegetablegraden.vegetable.Vegetable;

import java.util.HashSet;

public class GridGarden implements GardenBase
{
    private static final int AMOUNT_OF_COLUMNS = 16;
    private static final int AMOUNT_OF_ROWS = 34;

    private final Vegetable[][] garden;

    public GridGarden()
    {
        this.garden = new Vegetable[AMOUNT_OF_COLUMNS][AMOUNT_OF_ROWS];
    }

    @Override
    public void addVegetable(Vegetable vegetable) throws TooManyVegetablesException
    {
        for (int row = 0; row < this.garden.length; row++)
        {
            for (int column = 0; column < this.garden[row].length; column++)
            {
                if (this.garden[row][column] == null)
                {
                    this.garden[row][column] = vegetable;
                    return;
                }
            }
        }

        throw new TooManyVegetablesException();
    }

    @Override
    public HashSet<Vegetable> getReadyForHarvest()
    {
        HashSet<Vegetable> readyForHarvest = new HashSet<>();

        for (int row = 0; row < this.garden.length; row++)
        {
            for (int column = 0; column < this.garden[row].length; column++)
            {
                Vegetable vegetable = this.garden[row][column];
                if (vegetable != null && vegetable.getStatus() == Status.READY_TO_HARVEST)
                {
                    readyForHarvest.add(vegetable);
                }
            }
        }

        return readyForHarvest;
    }
}
