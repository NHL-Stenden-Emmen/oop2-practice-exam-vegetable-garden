package com.nhlstenden.vegetablegraden.garden;

public class TooManyVegetablesException extends Exception
{
    public TooManyVegetablesException()
    {
        super("There are too many vegetables in the garden!");
    }
}
