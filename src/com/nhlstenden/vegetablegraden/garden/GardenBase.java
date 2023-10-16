package com.nhlstenden.vegetablegraden.garden;

import com.nhlstenden.vegetablegraden.vegetable.Vegetable;

import java.util.HashSet;

// Assignment 6
public interface GardenBase
{
    void addVegetable(Vegetable vegetable) throws TooManyVegetablesException;
    HashSet<Vegetable> getReadyForHarvest();
}
